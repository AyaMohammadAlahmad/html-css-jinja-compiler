package Ast;

public class PositionalArgument extends Expression {

    private Expression value;

    public PositionalArgument(Expression value, int lineNumber) {
        super("PositionalArgument", lineNumber);
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");

        if (value != null) {
            value.print(indent + 1);
        } else {
            printIndent(indent + 1);
            System.out.println("<null-argument>");
        }
    }
}