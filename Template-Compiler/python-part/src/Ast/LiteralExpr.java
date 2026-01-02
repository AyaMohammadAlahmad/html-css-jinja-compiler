package Ast;

public class LiteralExpr extends Expression{
    private Object value;

    public LiteralExpr(Object value, int lineNumber) {
        super("LiteralExpr", lineNumber);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + value);
    }
}
