
        package visitor;

import Ast.*;
import antlr.pyParser;
import antlr.pyParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class AstBuilder extends pyParserBaseVisitor<Element> {

    // ================= Program =================
    @Override
    public Element visitProgramRule(pyParser.ProgramRuleContext ctx) {
        Program program = new Program(ctx.start.getLine());
        for (pyParser.ElementContext ectx : ctx.element()) {
            Element el = visit(ectx);
            if (el != null) program.addElement(el);
        }
        return program;
    }

    // ================= Import =================
    @Override public Element visitImportElement(pyParser.ImportElementContext ctx) { return visit(ctx.importStmt()); }
    @Override public Element visitImport(pyParser.ImportContext ctx) {
        int line = ctx.start.getLine();
        ArrayList<String> names = new ArrayList<>();
        names.add(ctx.dottedName().getText());
        return new ImportElement(null, names, line);
    }
    @Override public Element visitFromImportStmt(pyParser.FromImportStmtContext ctx) {
        int line = ctx.start.getLine();
        String module = ctx.getToken(pyParser.Identifier, 0).getText();
        ArrayList<String> names = new ArrayList<>();
        for (TerminalNode id : ctx.importList().getTokens(pyParser.Identifier)) names.add(id.getText());
        return new ImportElement(module, names, line);
    }

    // ================= Helpers =================
    @Override public Element visitDottedNameRule(pyParser.DottedNameRuleContext ctx) {  List<String> parts = new ArrayList<>();
        for (TerminalNode id : ctx.getTokens(pyParser.Identifier)) {
            parts.add(id.getText());
        }
        return new DottedNameExpr(parts, ctx.start.getLine()); }
    @Override public Element visitImportListRule(pyParser.ImportListRuleContext ctx) { return null; }
    // ================= Expression =================


    @Override
    public Element visitDecoratedFunctionElement(pyParser.DecoratedFunctionElementContext ctx) {
        return visit(ctx.decoratedFunction());
    }

    @Override
    public Element visitFunctionElement(pyParser.FunctionElementContext ctx) {
        return visit(ctx.functionDef());
    }
    @Override
    public Element visitDecoratedFunctionRule(pyParser.DecoratedFunctionRuleContext ctx) {
        // 1️⃣ زيارة كل decorator في القائمة
        List<CallExpr> decorators = new ArrayList<>();
        if (ctx.decorator() != null) {
            for (pyParser.DecoratorContext decCtx : ctx.decorator()) {
                decorators.add((CallExpr) visit(decCtx));
            }
        }

        // 2️⃣ زيارة الدالة نفسها
        FunctionDef function = (FunctionDef) visit(ctx.functionDef());

        // 3️⃣ إنشاء DecoratedFunction AST node
        return new DecoratedFunction(decorators, function, ctx.start.getLine());
    }

    @Override
    public Element visitFunctionDefRule(pyParser.FunctionDefRuleContext ctx) {
        String name = ctx.name.getText();

        List<String> params = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (TerminalNode id : ctx.parameterList().getTokens(pyParser.Identifier))
                params.add(id.getText());
        }

        Block body = (Block) visit(ctx.body);
        return new FunctionDef(name, params, body, ctx.start.getLine());
    }

    @Override
    public Element visitDecoratorRule(pyParser.DecoratorRuleContext ctx) {
        // زيارة اسم الدالة في الـ decorator
        Expression method = (Expression) visit(ctx.dottedName());

        // زيارة المعاملات إذا وجدت
        List<Expression> args = new ArrayList<>();
        if (ctx.argumentList() != null) {
            // استخدام getRuleContexts للحصول على جميع ArgumentContext
            for (pyParser.ArgumentContext argCtx : ctx.argumentList().getRuleContexts(pyParser.ArgumentContext.class)) {
                args.add((Expression) visit(argCtx));
            }
        }


        // إنشاء CallExpr للـ decorator
        return new CallExpr(method, args, ctx.start.getLine());
    }


    @Override
    public Element visitParameterListRule(pyParser.ParameterListRuleContext ctx) {
        List<Expression> params = new ArrayList<>();

        for (TerminalNode id : ctx.Identifier()) {
            params.add(
                    new LiteralExpr(id.getText(), ctx.start.getLine())
            );
        }

        return new ListExpr(params, ctx.start.getLine());
    }

    /* ================= Block ================= */

    @Override
    public Element visitBlockRule(pyParser.BlockRuleContext ctx) {
        List<Element> statements = new ArrayList<>();
        for (pyParser.StatementContext s : ctx.statement())
            statements.add(visit(s));
        return new Block("Block", ctx.start.getLine(), statements);
    }

    // ================= Statement =================

    @Override
    public Element visitStatementElement(pyParser.StatementElementContext ctx) {
        return super.visitStatementElement(ctx);
    }

    @Override
    public Element visitReturn(pyParser.ReturnContext ctx) {
        return super.visitReturn(ctx);
    }


    @Override
    public Element visitIf(pyParser.IfContext ctx) {
        return super.visitIf(ctx);
    }

    @Override
    public Element visitFor(pyParser.ForContext ctx) {
        return super.visitFor(ctx);
    }

    @Override
    public Element visitBreakStmt(pyParser.BreakStmtContext ctx) {
        return new BreakStmt(ctx.start.getLine());
    }

    @Override
    public Element visitAssignmentRule(pyParser.AssignmentRuleContext ctx) {
        String var = ctx.var.getText();
        Expression value = (Expression) visit(ctx.value);
        return new AssignmentStmt(var, value, ctx.start.getLine());
    }

    @Override
    public Element visitAugmentedAssignmentRule(pyParser.AugmentedAssignmentRuleContext ctx) {
        String var = ctx.var.getText();
        String op = ctx.op.getText();
        Expression value = (Expression) visit(ctx.value);

        Expression left = new DottedNameExpr(List.of(var), ctx.start.getLine());
        Expression binary = new BinaryExpr(left, op.substring(0, 1), value, ctx.start.getLine());
        return new AssignmentStmt(var, binary, ctx.start.getLine());
    }

    @Override
    public Element visitReturnRule(pyParser.ReturnRuleContext ctx) {
        List<Expression> values = new ArrayList<>();
        for (pyParser.ExpressionContext e : ctx.expression())
            values.add((Expression) visit(e));
        return new ReturnStmt(values, ctx.start.getLine());
    }

    @Override
    public Element visitIfStmtRule(pyParser.IfStmtRuleContext ctx) {
        Expression cond = (Expression) visit(ctx.condition);
        Block thenBlock = (Block) visit(ctx.thenBlock);
        Block elseBlock = ctx.elseBlock != null ? (Block) visit(ctx.elseBlock) : null;

        return new IfStmt(cond, thenBlock, elseBlock, "IfStmt", ctx.start.getLine());
    }

    @Override
    public Element visitForStmtRule(pyParser.ForStmtRuleContext ctx) {
        String var = ctx.var.getText();
        Expression iterable = (Expression) visit(ctx.iterable);
        Block body = (Block) visit(ctx.body);
        return new ForStmt(var, iterable, body, ctx.start.getLine());
    }

    // ================= Expression =================
    @Override public Element visitExpressionStmt(pyParser.ExpressionStmtContext ctx) { return visit(ctx.expression()); }
    @Override public Element visitExpression(pyParser.ExpressionContext ctx) { return visit(ctx.conditionalExpr()); }

    // ================= ConditionalExprRule =================
    @Override public Element visitConditionalExprRule(pyParser.ConditionalExprRuleContext ctx) {
        if (ctx.IF() != null) {
            Expression thenExpr = (Expression) visit(ctx.comparisonExpr());
            Expression condition = (Expression) visit(ctx.expression(0));
            Expression elseExpr = (Expression) visit(ctx.expression(1));
            return new ConditionalExpr(condition, thenExpr, elseExpr, ctx.start.getLine());
        }
        return visit(ctx.comparisonExpr());
    }

    // ================= ComparisonExprRule =================
    @Override public Element visitComparisonExprRule(pyParser.ComparisonExprRuleContext ctx) {
        Expression left = (Expression) visit(ctx.additiveExpr(0));
        if (ctx.additiveExpr().size() == 1) return left;
        Expression right = (Expression) visit(ctx.additiveExpr(1));
        String op = ctx.getChild(1).getText();
        return new BinaryExpr(left, op, right, ctx.start.getLine());
    }

    // ================= AdditiveExprRule =================
    @Override public Element visitAdditiveExprRule(pyParser.AdditiveExprRuleContext ctx) {
        Expression result = (Expression) visit(ctx.multiplicativeExpr(0));
        for (int i = 1; i < ctx.multiplicativeExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.multiplicativeExpr(i));
            result = new BinaryExpr(result, op, right, ctx.start.getLine());
        }
        return result;
    }

    // ================= MultiplicativeExprRule =================
    @Override public Element visitMultiplicativeExprRule(pyParser.MultiplicativeExprRuleContext ctx) {
        Expression result = (Expression) visit(ctx.powerExpr(0));
        for (int i = 1; i < ctx.powerExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.powerExpr(i));
            result = new BinaryExpr(result, op, right, ctx.start.getLine());
        }
        return result;
    }

    // ================= PowerExprRule =================
    @Override public Element visitPowerExprRule(pyParser.PowerExprRuleContext ctx) {
        Expression left = (Expression) visit(ctx.unaryExpr(0));
        if (ctx.unaryExpr().size() == 1) return left;
        Expression right = (Expression) visit(ctx.unaryExpr(1));
        return new BinaryExpr(left, "**", right, ctx.start.getLine());
    }

    // ================= UnaryExpr =================
    @Override public Element visitUnaryExpr(pyParser.UnaryExprContext ctx) {
        if (ctx.primaryExpr() != null) return visit(ctx.primaryExpr());
        String op = ctx.getChild(0).getText();
        Expression expr = (Expression) visit(ctx.unaryExpr());
        return new UnaryExpr(op, expr, ctx.start.getLine());
    }

    // ================= CallExpr =================

    @Override
    public Element visitFunctionCallExpr(pyParser.FunctionCallExprContext ctx) {
        return visit(ctx.functionCall());

    }

    @Override
    public Element visitMethodCallExpr(pyParser.MethodCallExprContext ctx) {
       return visit(ctx.methodCall());
    }


    @Override
    public Element visitFunctionCallRule(pyParser.FunctionCallRuleContext ctx) {
        Expression func = new DottedNameExpr(
                List.of(ctx.func.getText()),
                ctx.start.getLine()
        );

        List<Expression> args = new ArrayList<>();

        if (ctx.args != null) {
            for (pyParser.ArgumentContext a :
                    ctx.args.getRuleContexts(pyParser.ArgumentContext.class)) {

                Expression arg = (Expression) visit(a);

                if (arg == null) {
                    arg = new LiteralExpr(null, ctx.start.getLine());
                }

                args.add(arg);
            }
        }

        return new CallExpr(func, args, ctx.start.getLine());
    }

    @Override
    public Element visitMethodCallRule(pyParser.MethodCallRuleContext ctx) {
        Expression method = (Expression) visit(ctx.method);

        if (method == null) {
            method = new LiteralExpr(null, ctx.start.getLine());
        }

        List<Expression> args = new ArrayList<>();

        if (ctx.args != null) {
            for (pyParser.ArgumentContext a :
                    ctx.args.getRuleContexts(pyParser.ArgumentContext.class)) {

                Expression arg = (Expression) visit(a);

                if (arg == null) {
                    arg = new LiteralExpr(null, ctx.start.getLine());
                }

                args.add(arg);
            }
        }

        return new CallExpr(method, args, ctx.start.getLine());
    }
    // ================= IndexExpr =================


    @Override
    public Element visitIndexingExpr(pyParser.IndexingExprContext ctx) {
        return visit(ctx.indexing());
    }

    @Override
    public Element visitIndexingRule(pyParser.IndexingRuleContext ctx) {
        Expression target = (Expression) visit(ctx.target);
        Expression result = target;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getText().equals("[")) {
                ParseTree indexNode = ctx.getChild(i + 1);
                Expression index;

                if (indexNode instanceof TerminalNode) {
                    index = new LiteralExpr(indexNode.getText(), ctx.start.getLine());
                } else {
                    index = (Expression) visit(indexNode);
                }
                result = new IndexExpr(result, index, ctx.start.getLine());
            }
        }
        return result;
    }

    // ================= ComprehensionExpr =================
    @Override
    public Element visitComprehensionRule(pyParser.ComprehensionRuleContext ctx) {
        Expression expr = (Expression) visit(ctx.expression(0));
        String variable = ctx.Identifier().getText();
        Expression iterable = (Expression) visit(ctx.expression(1));
        Expression condition = ctx.expression().size() > 2 ? (Expression) visit(ctx.expression(2)) : null;
        return new ListComprehensionExpr(expr, variable, iterable, condition, ctx.start.getLine());
    }

    @Override
    public Element visitListComprehensionRule(pyParser.ListComprehensionRuleContext ctx) {
        return super.visitListComprehensionRule(ctx);
    }

    // ================= Collections =================

    @Override
    public Element visitDictRule(pyParser.DictRuleContext ctx) {
        List<DictItemExpr> items = new ArrayList<>();

        for (pyParser.DictItemContext itemCtx : ctx.dictItem()) {
            DictItemExpr item = (DictItemExpr) visit(itemCtx);
            if (item != null) items.add(item);
        }

        return new DictExpr(items, ctx.start.getLine());
    }

    @Override public Element visitDictExpr(pyParser.DictExprContext ctx) {
        List<DictItemExpr> items = new ArrayList<>();
        pyParser.DictContext dictCtx = ctx.dict();
        if (dictCtx != null) {
            for (pyParser.DictItemRuleContext itemCtx : dictCtx.getRuleContexts(pyParser.DictItemRuleContext.class))
                items.add((DictItemExpr) visit(itemCtx));
        }
        return new DictExpr(items, ctx.start.getLine());
    }

    @Override public Element visitDictItemRule(pyParser.DictItemRuleContext ctx) {
        String raw = ctx.key.getText();
        String keyValue = raw.substring(1, raw.length() - 1);

        Expression keyExpr =
                new LiteralExpr(keyValue, ctx.start.getLine());

        Expression valueExpr =
                (Expression) visit(ctx.value);

        if (valueExpr == null) {
            valueExpr = new LiteralExpr(null, ctx.start.getLine());
        }

        return new DictItemExpr(
                keyExpr,
                valueExpr,
                ctx.start.getLine()
        );
    }

    @Override public Element visitListExpr(pyParser.ListExprContext ctx) {
        pyParser.ListContext listCtx = ctx.list();
        if (listCtx != null) return visit(listCtx);
        return null;
    }

    @Override public Element visitListRule(pyParser.ListRuleContext ctx) {
        List<Expression> elements = new ArrayList<>();
        for (pyParser.ExpressionContext eCtx : ctx.expression()) elements.add((Expression) visit(eCtx));
        return new ListExpr(elements, ctx.start.getLine());
    }


    // ================= Literals =================

    @Override
    public Element visitStringLiteralRule(pyParser.StringLiteralRuleContext ctx) {
        String text = ctx.getText();
        return new LiteralExpr(text.substring(1, text.length() - 1), ctx.start.getLine());
    }

    @Override public Element visitNumberLiteralRule(pyParser.NumberLiteralRuleContext ctx) {
        return new LiteralExpr(Integer.parseInt(ctx.getText()), ctx.start.getLine());
    }

    @Override public Element visitNoneLiteralRule(pyParser.NoneLiteralRuleContext ctx) {
        return new LiteralExpr(null, ctx.start.getLine());
    }

    @Override public Element visitTrueLiteralRule(pyParser.TrueLiteralRuleContext ctx) {
        return new LiteralExpr(true, ctx.start.getLine());
    }

    @Override public Element visitFalseLiteralRule(pyParser.FalseLiteralRuleContext ctx) {
        return new LiteralExpr(false, ctx.start.getLine());
    }

    // ================= Arguments =================

    @Override
    public Element visitArgumentListRule(pyParser.ArgumentListRuleContext ctx) {
        List<Expression> args = new ArrayList<>();
        for (pyParser.ArgumentContext a : ctx.argument()) {
            args.add((Expression) visit(a));
        }
        return new ListExpr(args, ctx.start.getLine());
    }

    @Override
    public Element visitArgumentExpr(pyParser.ArgumentExprContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());

        if (expr == null) {
            expr = new LiteralExpr(null, ctx.start.getLine());
        }

        return new PositionalArgument(expr, ctx.start.getLine());
    }

    @Override
    public Element visitNamedArgumentExpr(pyParser.NamedArgumentExprContext ctx) {

        Expression value = (Expression) visit(ctx.expression());

        if (value == null) {
            value = new LiteralExpr(null, ctx.start.getLine());
        }

        return new NamedArgumentExp(
                ctx.Identifier().getText(),
                value,
                ctx.start.getLine()
        );
    }

    @Override
    public Element visitGeneratorArgumentExpr(pyParser.GeneratorArgumentExprContext ctx) {
        pyParser.GeneratorExprContext gctx = ctx.generatorExpr();

        // expressions
        List<pyParser.ExpressionContext> exprs =
                gctx.getRuleContexts(pyParser.ExpressionContext.class);

        Expression element =
                (Expression) visit(exprs.get(0));

        Expression iterable =
                (Expression) visit(exprs.get(1));

        Expression condition =
                exprs.size() > 2
                        ? (Expression) visit(exprs.get(2))
                        : null;

        // identifier
        String variable =
                gctx.getToken(pyParser.Identifier, 0).getText();

        return new GeneratorArgumentExp(
                element,
                variable,
                iterable,
                condition,
                ctx.start.getLine()
        );
    }

    // ================= Names =================
    @Override public Element visitDottedNameExpr(pyParser.DottedNameExprContext ctx) {
        List<String> parts = new ArrayList<>();
        for (TerminalNode id : ctx.dottedName().getTokens(pyParser.Identifier)) parts.add(id.getText());
        return new DottedNameExpr(parts, ctx.start.getLine());
    }

    @Override public Element visitParenExpr(pyParser.ParenExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override public Element visitLiteralExpr(pyParser.LiteralExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Element visitGeneratorExprRule(pyParser.GeneratorExprRuleContext ctx) {
        Expression element = (Expression) visit(ctx.expression(0));
        String var = ctx.Identifier().getText();
        Expression iterable = (Expression) visit(ctx.expression(1));
        Expression cond = ctx.expression().size() > 2
                ? (Expression) visit(ctx.expression(2))
                : null;

        return new GeneratorArgumentExp(
                element, var, iterable, cond, ctx.start.getLine()
        );
    }
}