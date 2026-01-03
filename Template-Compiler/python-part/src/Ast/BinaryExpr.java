package Ast;

public class BinaryExpr extends Expression{
    private Expression left;
    private String operator;
    private Expression right;

    public BinaryExpr(Expression left, String operator, Expression right, int lineNumber) {
        super("BinaryExpr", lineNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + operator);
        left.print(indent + 1);
        right.print(indent + 1);
    }
}
