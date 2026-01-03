package Visitor;

import AST.*;
import Semantic.Symbol;
import Semantic.SymbolKind;
import Semantic.SymbolTable;

public class SymbolTableVisitor {

    private SymbolTable rootScope = new SymbolTable();
    private SymbolTable currentScope = rootScope;

    public SymbolTable getSymbolTable() {
        return rootScope;
    }

    public void visit(ASTNode node) {
        if (node == null) return;
        if (node instanceof ASTTemplate template) {
            for (ASTNode c : template.getContents()) {
                visit(c);
            }
        }
        else if (node instanceof HtmlElementNode element) {
            for (ContentNode c : element.getChildren()) {
                visit(c);
            }
        }
        else if (node instanceof ASTBlock block) {
            handleBlock(block);
        }
        else if (node instanceof ASTJinjaExpression expr) {
            handleJinjaExpression(expr);
        }
        else if (node instanceof ASTJinjaStatementNode stmtNode) {
            handleJinjaStatementNode(stmtNode);
        }
    }

    private void handleBlock(ASTBlock block) {
        if (currentScope.lookup(block.getBlockName()) == null) {
            currentScope.add(new Symbol(block.getBlockName(), SymbolKind.BLOCK, block.getLine()));
        }
        SymbolTable previousScope = currentScope;
        currentScope = new SymbolTable(previousScope);

        for (ContentNode c : block.getContents()) {
            visit(c);
        }
        currentScope = previousScope;
    }

    private void handleJinjaExpression(ASTJinjaExpression expr) {
        String text = expr.getText().trim();
        if (text.contains("(")) {
            String name = text.substring(0, text.indexOf("("));
            if (currentScope.lookup(name) == null) {
                currentScope.add(new Symbol(name, SymbolKind.FUNCTION, expr.getLine()));
            }
        } else if (!text.isEmpty()) {
            if (currentScope.lookup(text) == null) {
                currentScope.add(new Symbol(text, SymbolKind.VARIABLE, expr.getLine()));
            }
        }
    }

    private void handleJinjaStatementNode(ASTJinjaStatementNode stmt) {
        String text = stmt.getText().trim();
        if (!text.startsWith("endblock") && !text.isEmpty()) {
            if (currentScope.lookup(text) == null) {
                currentScope.add(new Symbol(text, SymbolKind.VARIABLE, stmt.getLine()));
            }
        }
    }
}
