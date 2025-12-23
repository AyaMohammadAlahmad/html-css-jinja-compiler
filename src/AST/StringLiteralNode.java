package AST;

public class StringLiteralNode extends ASTNode {

    private String value;

    public StringLiteralNode(String value, int line) {
        super(line);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String print(String indent) {
        return indent + "StringLiteral: \"" + value + "\"\n";
    }
}
