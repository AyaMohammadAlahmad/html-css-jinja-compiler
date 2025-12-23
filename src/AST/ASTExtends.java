package AST;

public class ASTExtends extends ASTJinjaStatement {

    private String templateName;

    public ASTExtends(String templateName, int line) {
        super(line);
        this.templateName = templateName;
    }

    @Override
    public String print(String indent) {
        return indent + "Extends: " + templateName + "\n";
    }
}
