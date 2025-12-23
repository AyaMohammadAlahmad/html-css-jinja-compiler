package AST;

public class DoctypeNode extends ContentNode {

    private String value;

    public DoctypeNode(String value, int line) {
        super(line);
        this.value = value;
    }

    @Override
    public String print(String indent) {
        return indent + "Doctype: " + value + "\n";
    }
}
