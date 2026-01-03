package AST;

public class AttributeNode extends ASTNode {

    private String name;
    private ASTNode value;

    public AttributeNode(String name, ASTNode value, int line) {
        super(line);
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public ASTNode getValue() {
        return value;
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
