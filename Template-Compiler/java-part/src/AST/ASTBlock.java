package AST;
import java.util.ArrayList;
import java.util.List;
public class ASTBlock extends ContentNode {
    private final String blockName;
    private final List<ContentNode> contents;
    public ASTBlock(String blockName, int line) {
        super(line);
        this.blockName = blockName;
        this.contents = new ArrayList<>();}
    public String getBlockName() {
        return blockName;}
    public List<ContentNode> getContents() {
        return contents;}
    public void addContent(ContentNode node) {
        contents.add(node);
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
                .append("ASTBlock: ")
                .append(blockName)
                .append(" (line ")
                .append(line)
                .append(")\n");
        for (ContentNode child : contents) {
            sb.append(child.print(indent + "  "));
        }
        return sb.toString();
    }
}
