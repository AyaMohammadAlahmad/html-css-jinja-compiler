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
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FunctionCall: ").append(functionName).append("\n");

        for (ASTNode arg : arguments) {
            sb.append(arg.print(indent + "  "));
        }
        return sb.toString();
    }
}
