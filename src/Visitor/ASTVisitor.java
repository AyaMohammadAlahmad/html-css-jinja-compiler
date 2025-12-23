package Visitor;

import AST.*;
import antlar.htmlParser;
import antlar.htmlParserBaseVisitor;

public class ASTVisitor extends htmlParserBaseVisitor<ASTNode> {

    /* =======================
       نقطة البداية
       ======================= */
    @Override
    public ASTNode visitTemplate(htmlParser.TemplateContext ctx) {
        ASTTemplate template = new ASTTemplate(ctx.getStart().getLine());

        for (htmlParser.ContentContext c : ctx.content()) {
            ASTNode node = visit(c);
            if (node != null) {
                template.addContent(node);
            }
        }
        return template;
    }

    /* =======================
       content
       ======================= */
    @Override
    public ASTNode visitContent(htmlParser.ContentContext ctx) {

        if (ctx.doctype() != null)
            return visit(ctx.doctype());

        if (ctx.html_element() != null)
            return visit(ctx.html_element());

        if (ctx.style_element() != null)
            return visit(ctx.style_element());

        if (ctx.jinja_statement() != null)
            return visit(ctx.jinja_statement());

        if (ctx.jinja_expression() != null)
            return visit(ctx.jinja_expression());

        if (ctx.TEXT() != null)
            return new TextNode(ctx.TEXT().getText(), ctx.getStart().getLine());

        return null;
    }

    /* =======================
       Doctype
       ======================= */
    @Override
    public ASTNode visitDoctype(htmlParser.DoctypeContext ctx) {
        return new DoctypeNode(
                ctx.DOCTYPE().getText(),
                ctx.getStart().getLine()
        );
    }

    /* =======================
       HTML Elements
       ======================= */
    @Override
    public ASTNode visitHtml_element(htmlParser.Html_elementContext ctx) {

        // <tag> ... </tag>
        if (ctx.html_open_tag() != null) {
            String tagName = ctx.html_open_tag().IDENTIFIER().getText();
            HtmlElementNode element =
                    new HtmlElementNode(tagName, false, ctx.getStart().getLine());

            if (ctx.html_open_tag().attribute_list() != null) {
                visitAttributes(ctx.html_open_tag().attribute_list(), element);
            }

            for (htmlParser.ContentContext c : ctx.content()) {
                ContentNode child = (ContentNode) visit(c);
                if (child != null) {
                    element.addChild(child);
                }
            }
            return element;
        }

        // <tag />
        if (ctx.html_self_closing_tag() != null) {
            String tagName = ctx.html_self_closing_tag().IDENTIFIER().getText();
            HtmlElementNode element =
                    new HtmlElementNode(tagName, true, ctx.getStart().getLine());

            if (ctx.html_self_closing_tag().attribute_list() != null) {
                visitAttributes(ctx.html_self_closing_tag().attribute_list(), element);
            }
            return element;
        }

        // <img>, <br>, ...
        if (ctx.html_void_element() != null) {
            String tagName = ctx.html_void_element().VOID_TAG().getText();
            HtmlElementNode element =
                    new HtmlElementNode(tagName, true, ctx.getStart().getLine());

            if (ctx.html_void_element().attribute_list() != null) {
                visitAttributes(ctx.html_void_element().attribute_list(), element);
            }
            return element;
        }

        return null;
    }

    private void visitAttributes(
            htmlParser.Attribute_listContext ctx,
            HtmlElementNode element) {

        for (htmlParser.AttributeContext a : ctx.attribute()) {
            element.addAttribute((AttributeNode) visit(a));
        }
    }

    @Override
    public ASTNode visitAttribute(htmlParser.AttributeContext ctx) {
        return new AttributeNode(
                ctx.IDENTIFIER().getText(),
                visit(ctx.attribute_value()),
                ctx.getStart().getLine()
        );
    }

    @Override
    public ASTNode visitAttribute_value(htmlParser.Attribute_valueContext ctx) {

        if (ctx.STRING() != null)
            return new StringLiteralNode(
                    ctx.STRING().getText(),
                    ctx.getStart().getLine()
            );

        if (ctx.jinja_expression() != null)
            return visit(ctx.jinja_expression());

        return null;
    }

    /* =======================
       Style
       ======================= */
    @Override
    public ASTNode visitStyle_element(htmlParser.Style_elementContext ctx) {
        ASTStyle style = new ASTStyle(ctx.getStart().getLine());

        for (var css : ctx.CSS_TEXT()) {
            style.addCssLine(css.getText());
        }
        return style;
    }

    /* =======================
       Jinja Statements
       ======================= */
    @Override
    public ASTNode visitJinja_statement(htmlParser.Jinja_statementContext ctx) {
        return visit(ctx.jinja_stmt_body());
    }

    @Override
    public ASTNode visitExtends_stmt(htmlParser.Extends_stmtContext ctx) {
        return new ASTExtends(
                ctx.STRING_J().getText(),
                ctx.getStart().getLine()
        );
    }

    @Override
    public ASTNode visitBlock_stmt(htmlParser.Block_stmtContext ctx) {
        return new ASTBlock(
                ctx.IDENTIFIER_J().getText(),
                ctx.getStart().getLine()
        );
    }

    @Override
    public ASTNode visitEndblock_stmt(htmlParser.Endblock_stmtContext ctx) {
        return new ASTEndBlock(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitFor_stmt(htmlParser.For_stmtContext ctx) {
        return new ASTFor(
                ctx.IDENTIFIER_J(0).getText(),
                ctx.IDENTIFIER_J(1).getText(),
                ctx.getStart().getLine()
        );
    }

    @Override
    public ASTNode visitEndfor_stmt(htmlParser.Endfor_stmtContext ctx) {
        return new ASTEndFor(ctx.getStart().getLine());
    }

    /* =======================
       Jinja Expressions
       ======================= */
    @Override
    public ASTNode visitJinja_expression(htmlParser.Jinja_expressionContext ctx) {
        ASTExpression expr = (ASTExpression) visit(ctx.expression());
        return new ASTJinjaExpression(expr, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitVariable(htmlParser.VariableContext ctx) {
        ASTVariable var = new ASTVariable(ctx.getStart().getLine());

        for (var id : ctx.IDENTIFIER_E()) {
            var.addIdentifier(id.getText());
        }
        return var;
    }

    @Override
    public ASTNode visitFunction_call(htmlParser.Function_callContext ctx) {
        ASTFunctionCall call =
                new ASTFunctionCall(
                        ctx.IDENTIFIER_E().getText(),
                        ctx.getStart().getLine()
                );

        if (ctx.argument_list() != null) {
            for (htmlParser.ArgumentContext a : ctx.argument_list().argument()) {
                call.addArgument(visit(a));
            }
        }
        return call;
    }

    @Override
    public ASTNode visitArgument(htmlParser.ArgumentContext ctx) {

        if (ctx.STRING_E() != null)
            return new StringLiteralNode(
                    ctx.STRING_E().getText(),
                    ctx.getStart().getLine()
            );

        if (ctx.expression() != null)
            return visit(ctx.expression());

        return null;
    }
}
