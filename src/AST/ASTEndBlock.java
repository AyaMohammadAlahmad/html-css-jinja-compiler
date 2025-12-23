package AST;

public class ASTEndBlock extends ASTJinjaStatement {

    public ASTEndBlock(int line) {
        super(line);
    }

    @Override
    public String print(String indent) {
        return indent + "EndBlock\n";
    }
}
