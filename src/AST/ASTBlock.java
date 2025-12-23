package AST;

import java.util.ArrayList;
import java.util.List;

public class ASTBlock extends ASTJinjaStatement {

    private String blockName;
    private List<ContentNode> contents;

    public ASTBlock(String blockName, int line) {
        super(line);
        this.blockName = blockName;
        this.contents = new ArrayList<>();
    }

    public void addContent(ContentNode node) {
        contents.add(node);
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Block: ").append(blockName).append("\n");

        for (ContentNode node : contents) {
            sb.append(node.print(indent + "  "));
        }
        return sb.toString();
    }
}
