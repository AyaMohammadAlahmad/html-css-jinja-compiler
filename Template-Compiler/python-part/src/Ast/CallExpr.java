package Ast;

import java.util.List;

public class CallExpr extends Expression {

    private Expression function;
    private List<Expression> arguments;

    public CallExpr(Expression function, List<Expression> arguments, int lineNumber) {
        super("CallExpr", lineNumber);
        this.function = function;
        this.arguments = arguments;
    }
<<<<<<< HEAD
    public Expression getFunction() {
        return function;
    }

    public List<Expression> getArguments() {
        return arguments;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");

        printIndent(indent + 1);
        System.out.println("Function:");
        function.print(indent + 2);

        printIndent(indent + 1);
        System.out.println("Arguments:");
        if (arguments != null && !arguments.isEmpty()) {
            for (Expression arg : arguments) {
                arg.print(indent + 2);
            }
        } else {
            printIndent(indent + 2);
            System.out.println("<no-arguments>");
        }
    }
}