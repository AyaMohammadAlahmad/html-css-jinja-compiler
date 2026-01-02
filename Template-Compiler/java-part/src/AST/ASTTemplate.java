package AST;

import java.util.ArrayList;
import java.util.List;

public class ASTTemplate extends ASTNode {

    private List<ASTNode> contents;

    public ASTTemplate(int line) {
        super(line);
        this.contents = new ArrayList<>();
    }
    public void addContent(ASTNode node) {
        contents.add(node);
    }
    public List<ASTNode> getContents() {
        return contents;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
                .append(getClass().getSimpleName())
                .append(" (line ")
                .append(line)
                .append(")\n");

        for (ASTNode child : contents) {
            sb.append(child.print(indent + "  "));
        }

        return sb.toString();
    }

}
