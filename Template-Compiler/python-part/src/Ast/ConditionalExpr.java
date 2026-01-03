package Ast;

public class ConditionalExpr extends Expression{
    private Expression condition;
    private Expression thenExpr;
    private Expression elseExpr;

    public ConditionalExpr(Expression condition, Expression thenExpr, Expression elseExpr, int lineNumber) {
        super("ConditionalExpr", lineNumber);
        this.condition = condition;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
    }

<<<<<<< HEAD

=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6
    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        printIndent(indent + 1); System.out.println("Condition:");
        condition.print(indent + 2);
        printIndent(indent + 1); System.out.println("Then:");
        thenExpr.print(indent + 2);
        printIndent(indent + 1); System.out.println("Else:");
        elseExpr.print(indent + 2);
    }
}
