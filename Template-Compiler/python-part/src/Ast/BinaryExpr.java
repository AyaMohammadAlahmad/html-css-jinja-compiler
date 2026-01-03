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
<<<<<<< HEAD
    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + operator);
        left.print(indent + 1);
        right.print(indent + 1);
    }
}
