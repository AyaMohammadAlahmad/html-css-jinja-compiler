package AST;

public class TextNode extends ContentNode {

    private String text;

    public TextNode(String text, int line) {
        super(line);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String print(String indent) {
        return indent + "Text: \"" + text + "\"\n";
    }
}