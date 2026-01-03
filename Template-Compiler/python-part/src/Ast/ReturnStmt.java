package Ast;

import java.util.List;

public class ReturnStmt extends Element {
    private List<Expression> values;

    public ReturnStmt(List<Expression> values, int lineNumber) {
        super("ReturnStmt", lineNumber);
        this.values = values;
    }
<<<<<<< HEAD
    public List<Expression> getValues() {
        return values;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (Expression e : values) {
            e.print(indent + 1);
        }
    }
}