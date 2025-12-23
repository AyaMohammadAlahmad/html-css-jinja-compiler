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
                .append("Attribute: ")
                .append(name)
                .append(" = ");

        if (value != null) {
            sb.append("\n");
            sb.append(value.print(indent + "  "));
        } else {
            sb.append("null\n");
        }

        return sb.toString();
    }
}
