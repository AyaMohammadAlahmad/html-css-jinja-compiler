package AST;

public class DoctypeNode extends ContentNode {

    private String value;

    public DoctypeNode(String value, int line) {
        super(line);
        this.value = value;
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
