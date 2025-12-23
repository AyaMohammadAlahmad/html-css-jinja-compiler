package AST;

public abstract class ASTNode {

    protected int line;

    public ASTNode(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    // كل Node رح تطبع حالها
    public abstract String print(String indent);
}
