package AST;

public abstract class ASTJinjaStatement extends ContentNode {
    private String text;

    public ASTJinjaStatement(String text, int line) {
        super(line);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

