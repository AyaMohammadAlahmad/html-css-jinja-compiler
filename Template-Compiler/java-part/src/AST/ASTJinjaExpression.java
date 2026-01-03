package AST;

public class ASTJinjaExpression extends ContentNode {
    private String text;

    public ASTJinjaExpression(String text, int line) {
        super(line);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
                .append(getClass().getSimpleName())
                .append(" (line ")
                .append(line)
                .append(")\n");
        return sb.toString();
    }
}
