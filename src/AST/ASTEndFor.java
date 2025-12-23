package AST;

public class ASTEndFor extends ASTJinjaStatement {

    public ASTEndFor(int line) {
        super(line);
    }

    @Override
    public String print(String indent) {
        return indent + "EndFor\n";
    }
}
