package AST;

public class ASTJinjaStatementNode extends ASTJinjaStatement {

    private String content;

    public ASTJinjaStatementNode(String content, int line) {
        super("endblock", line);
        this.content = content;
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
