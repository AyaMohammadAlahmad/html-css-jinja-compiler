package Visitor;

import AST.*;
import antlar.htmlParser;
import antlar.htmlParserBaseVisitor;

import java.util.Stack;

public class ASTVisitor extends htmlParserBaseVisitor<ASTNode> {

    private final Stack<ASTBlock> blockStack = new Stack<>();

    private ASTTemplate root;

    @Override
    public ASTNode visitTemplate(htmlParser.TemplateContext ctx) {
        root = new ASTTemplate(ctx.getStart().getLine());

        for (htmlParser.ContentContext c : ctx.content()) {
            ASTNode node = visit(c);
            if (node instanceof ContentNode) {
                root.addContent((ContentNode) node);
            }
        }
        return root;
    }

    @Override
    public ASTNode visitContent(htmlParser.ContentContext ctx) {
        ASTNode node = null;

        if (ctx.doctype() != null) node = visit(ctx.doctype());
        else if (ctx.html_element() != null) node = visit(ctx.html_element());
        else if (ctx.style_element() != null) node = visit(ctx.style_element());
        else if (ctx.jinja_statement() != null) node = visit(ctx.jinja_statement());
        else if (ctx.jinja_expression() != null) node = visit(ctx.jinja_expression());
        else if (ctx.TEXT() != null)
            node = new TextNode(ctx.TEXT().getText(), ctx.getStart().getLine());
        if (node instanceof ContentNode && !blockStack.isEmpty()) {
            blockStack.peek().addContent((ContentNode) node);
            return null;
        }
        return node;
    }

    @Override
    public ASTNode visitDoctype(htmlParser.DoctypeContext ctx) {
        return new DoctypeNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitHtml_element(htmlParser.Html_elementContext ctx) {

        HtmlElementNode node;

        if (ctx.html_open_tag() != null) {

            String tag = ctx.html_open_tag().IDENTIFIER().getText();
            node = new HtmlElementNode(tag, false, ctx.getStart().getLine());

            if (ctx.html_open_tag().attribute_list() != null) {
                for (var a : ctx.html_open_tag().attribute_list().attribute()) {
                    ASTNode attr = visit(a);
                    if (attr instanceof AttributeNode) {
                        node.addAttribute((AttributeNode) attr);
                    }
                }
            }
            for (var c : ctx.content()) {
                ASTNode child = visit(c);
                if (child instanceof ContentNode) {
                    node.addChild((ContentNode) child);
                }
            }
            return node;
        }
        if (ctx.html_self_closing_tag() != null) {
            String tag = ctx.html_self_closing_tag().IDENTIFIER().getText();
            return new HtmlElementNode(tag, true, ctx.getStart().getLine());
        }
        if (ctx.html_void_element() != null) {
            String tag = ctx.html_void_element().VOID_TAG().getText();
            return new HtmlElementNode(tag, true, ctx.getStart().getLine());
        }
        return null;
    }

    @Override
    public ASTNode visitJinja_statement(htmlParser.Jinja_statementContext ctx) {

        String text = ctx.getText().trim();

        if (text.startsWith("{%") && text.endsWith("%}")) {
            text = text.substring(2, text.length() - 2).trim();
        }
        if (text.startsWith("block")) {
            String name = text.substring("block".length()).trim();
            ASTBlock block = new ASTBlock(name, ctx.getStart().getLine());
            blockStack.push(block);
            return null;
        }
        if (text.startsWith("endblock")) {
            if (!blockStack.isEmpty()) {
                ASTBlock finished = blockStack.pop();

                if (!blockStack.isEmpty()) {
                    blockStack.peek().addContent(finished);
                } else {
                    root.addContent(finished);
                }
            }
            return null;
        }
        return new ASTJinjaStatementNode(text, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitJinja_expression(htmlParser.Jinja_expressionContext ctx) {
        return new ASTJinjaExpression(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitStyle_element(htmlParser.Style_elementContext ctx) {
        ASTStyle style = new ASTStyle(ctx.getStart().getLine());
        for (var css : ctx.CSS_TEXT()) {
            style.addCssLine(css.getText());
        }
        return style;
    }
}
