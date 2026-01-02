package Ast;

public class UnaryExpr extends Expression{
    private String operator;
    private Expression operand;
    public UnaryExpr(String operator, Expression operand, int lineNumber) {
        super("UnaryExpr", lineNumber);
        this.operator = operator;
        this.operand = operand;
    }
    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + operator);
        operand.print(indent + 1);
    }
}
