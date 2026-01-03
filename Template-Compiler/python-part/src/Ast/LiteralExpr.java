package Ast;

public class LiteralExpr extends Expression{
    private Object value;

    public LiteralExpr(Object value, int lineNumber) {
        super("LiteralExpr", lineNumber);
        this.value = value;
    }
<<<<<<< HEAD
    public Object getValue() {
        return value;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + value);
    }
}
