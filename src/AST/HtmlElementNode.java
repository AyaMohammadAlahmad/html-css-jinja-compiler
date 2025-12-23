package AST;


import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode extends ContentNode {

    private String tagName;
    private List<AttributeNode> attributes;
    private List<ContentNode> children;
    private boolean selfClosing;

    public HtmlElementNode(String tagName, boolean selfClosing, int line) {
        super(line);
        this.tagName = tagName;
        this.selfClosing = selfClosing;
        this.attributes = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void addAttribute(AttributeNode attr) {
        attributes.add(attr);
    }

    public void addChild(ContentNode node) {
        children.add(node);
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("HtmlElement: <").append(tagName);

        if (selfClosing) sb.append(" /");

        sb.append(">\n");

        for (AttributeNode attr : attributes) {
            sb.append(attr.print(indent + "  "));
        }

        for (ContentNode child : children) {
            sb.append(child.print(indent + "  "));
        }

        return sb.toString();
    }
}