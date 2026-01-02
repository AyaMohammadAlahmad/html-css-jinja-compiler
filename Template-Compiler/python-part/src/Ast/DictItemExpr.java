package Ast;

public class DictItemExpr extends Expression {

    private Expression key;
    private Expression value;

    public DictItemExpr(Expression key, Expression value, int lineNumber) {
        super("DictItemExpr", lineNumber);
        this.key = key;
        this.value = value;
    }

    public Expression getKey() {
        return key;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        printIndent(indent + 1); System.out.println("Key:");
        key.print(indent + 2);
        printIndent(indent + 1); System.out.println("Value:");
        value.print(indent + 2);
    }
}