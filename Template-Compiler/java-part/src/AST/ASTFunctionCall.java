package AST;

import java.util.ArrayList;
import java.util.List;

public class ASTFunctionCall extends ASTExpression {

    private String functionName;
    private List<ASTNode> arguments;

    public ASTFunctionCall(String functionName, int line) {
        super(line);
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
    }

    public void addArgument(ASTNode arg) {
        arguments.add(arg);
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
