package Ast;

import java.util.List;

public class DecoratedFunction extends Element {

    private List<CallExpr> decorators; // decorators
    private FunctionDef function;      // الدالة نفسها

    public DecoratedFunction(List<CallExpr> decorators,
                             FunctionDef function,
                             int lineNumber) {
        super("DecoratedFunction", lineNumber);
        this.decorators = decorators;
        this.function = function;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");

        printIndent(indent + 1);
        System.out.println("Decorators:");
        for (CallExpr d : decorators) {
            d.print(indent + 2);
        }

        printIndent(indent + 1);
        System.out.println("Function:");
        function.print(indent + 2);
    }
}