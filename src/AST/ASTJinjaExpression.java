package AST;

public class ASTJinjaExpression extends ContentNode {

    private ASTExpression expression;

    public ASTJinjaExpression(ASTExpression expression, int line) {
        super(line);
        this.expression = expression;
    }

    public ASTExpression getExpression() {
        return expression;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("JinjaExpression\n");

        if (expression != null) {
            sb.append(expression.print(indent + "  "));
        } else {
            sb.append(indent).append("  ").append("<invalid expression>\n");
        }

        return sb.toString();
    }

}
