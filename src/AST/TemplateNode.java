package AST;

import java.util.ArrayList;
import java.util.List;

public class TemplateNode extends ASTNode {

    private List<ASTNode> contents;

    public TemplateNode(int line) {
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
        sb.append(indent).append("Template\n");

        for (ASTNode node : contents) {
            sb.append(node.print(indent + "  "));
        }

        return sb.toString();
    }
}
