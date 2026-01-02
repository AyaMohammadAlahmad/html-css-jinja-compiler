package Ast;

import java.util.List;

public class ListExpr extends Expression{
    private List<Expression> elements;

    public ListExpr(List<Expression> elements, int lineNumber) {
        super("ListExpr", lineNumber);
        this.elements = elements;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (Expression e : elements) e.print(indent + 1);
    }
}
