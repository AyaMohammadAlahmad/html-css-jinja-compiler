package Ast;

import java.util.List;

public class ListExpr extends Expression{
    private List<Expression> elements;

    public ListExpr(List<Expression> elements, int lineNumber) {
        super("ListExpr", lineNumber);
        this.elements = elements;
    }
<<<<<<< HEAD
    public List<Expression> getElements() {
        return elements;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (Expression e : elements) e.print(indent + 1);
    }
}
