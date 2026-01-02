package AST;

import java.util.ArrayList;
import java.util.List;

public class ASTVariable extends ASTExpression {

    private List<String> identifiers;

    public ASTVariable(int line) {
        super(line);
        this.identifiers = new ArrayList<>();
    }

    public void addIdentifier(String id) {
        identifiers.add(id);
    }

    @Override
    public String print(String indent) {
        return indent
                + getClass().getSimpleName()
                + " (line "
                + line
                + ")\n";
    }

}
