package visitor;

import Ast.*;
import symbolTable.*;

public class PythonsymbolTablevisitor {

    private final SymbolTablepy symbolTable = new SymbolTablepy();

    public SymbolTablepy getSymbolTable() {
        return symbolTable;
    }

    /* ================= Program ================= */

    public void visit(Program program) {
        for (Element e : program.getElements()) {
            visitElement(e);
        }
    }

    /* ================= Dispatcher ================= */

    private void visitElement(Element e) {
        if (e == null) return;

        if (e instanceof AssignmentStmt) {
            visitAssignment((AssignmentStmt) e);
        } else if (e instanceof FunctionDef) {
            visitFunction((FunctionDef) e);
        } else if (e instanceof Block) {
            visitBlock((Block) e);
        } else if (e instanceof IfStmt) {
            visitIf((IfStmt) e);
        } else if (e instanceof ForStmt) {
            visitFor((ForStmt) e);
        } else if (e instanceof ReturnStmt) {
            visitReturn((ReturnStmt) e);
        } else if (e instanceof Expression) {
            visitExpression((Expression) e);
        }
    }

    /* ================= Statements ================= */

    private void visitAssignment(AssignmentStmt stmt) {
        String name = stmt.getVariable();
        VariableSymbol sym = symbolTable.lookup(name);

        Object value = evaluateLiteral(stmt.getValue());

        if (sym == null) {
            symbolTable.insert(name, "var", value);
        } else {
            symbolTable.setAttribute(name, value);
        }

        visitExpression(stmt.getValue());
    }

    private void visitFunction(FunctionDef func) {
        // إدخال اسم الدالة في الـ scope الحالي
        symbolTable.insert(func.getName(), "function", null);

        // scope جديد
        symbolTable.allocate();

        // parameters
        for (String param : func.getParameters()) {
            symbolTable.insert(param, "param", null);
        }

        visitBlock(func.getBody());

        symbolTable.free();
    }

    private void visitBlock(Block block) {
        symbolTable.allocate();
        for (Element stmt : block.getStatements()) {
            visitElement(stmt);
        }
        symbolTable.free();
    }

    private void visitIf(IfStmt stmt) {
        visitExpression(stmt.getCondition());

        visitBlock(stmt.getThenBlock());

        if (stmt.getElseBlock() != null) {
            visitBlock(stmt.getElseBlock());
        }
    }

    private void visitFor(ForStmt stmt) {
        symbolTable.allocate();

        symbolTable.insert(stmt.getVariable(), "loop_var", null);
        visitExpression(stmt.getIterable());
        visitBlock(stmt.getBody());

        symbolTable.free();
    }

    private void visitReturn(ReturnStmt stmt) {
        for (Expression e : stmt.getValues()) {
            visitExpression(e);
        }
    }

    /* ================= Expressions ================= */

    private void visitExpression(Expression expr) {
        if (expr == null) return;

        if (expr instanceof BinaryExpr) {
            visitExpression(((BinaryExpr) expr).getLeft());
            visitExpression(((BinaryExpr) expr).getRight());
        } else if (expr instanceof UnaryExpr) {
            visitExpression(((UnaryExpr) expr).getOperand());
        } else if (expr instanceof CallExpr) {
            visitExpression(((CallExpr) expr).getFunction());
            for (Expression arg : ((CallExpr) expr).getArguments()) {
                visitExpression(arg);
            }
        } else if (expr instanceof IndexExpr) {
            visitExpression(((IndexExpr) expr).getTarget());
            visitExpression(((IndexExpr) expr).getIndex());
        } else if (expr instanceof ListExpr) {for (Expression e : ((ListExpr) expr).getElements()) {
            visitExpression(e);
        }
        } else if (expr instanceof DictExpr) {
            for (DictItemExpr item : ((DictExpr) expr).getItems()) {
                visitExpression(item.getKey());
                visitExpression(item.getValue());
            }
        }
        // LiteralExpr و DottedNameExpr لا يحتاجوا معالجة
    }

    /* ================= Helpers ================= */

    private Object evaluateLiteral(Expression expr) {
        if (expr instanceof LiteralExpr) {
            return ((LiteralExpr) expr).getValue();
        }
        return null;
    }
}