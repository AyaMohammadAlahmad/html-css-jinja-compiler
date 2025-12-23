package AST;

import java.util.ArrayList;
import java.util.List;

public class ASTFor extends ASTJinjaStatement {

    private String iterator;
    private String iterable;
    private List<ContentNode> contents;

    public ASTFor(String iterator, String iterable, int line) {
        super(line);
        this.iterator = iterator;
        this.iterable = iterable;
        this.contents = new ArrayList<>();
    }

    public void addContent(ContentNode node) {
        contents.add(node);
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
                .append("For: ")
                .append(iterator)
                .append(" in ")
                .append(iterable)
                .append("\n");

        for (ContentNode node : contents) {
            sb.append(node.print(indent + "  "));
        }
        return sb.toString();
    }
}
