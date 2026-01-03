package Ast;

public class UnaryExpr extends Expression{
    private String operator;
    private Expression operand;
    public UnaryExpr(String operator, Expression operand, int lineNumber) {
        super("UnaryExpr", lineNumber);
        this.operator = operator;
        this.operand = operand;
    }
<<<<<<< HEAD
    public String getOperator() {
        return operator;
    }

    public Expression getOperand() {
        return operand;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6
    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + operator);
        operand.print(indent + 1);
    }
}
