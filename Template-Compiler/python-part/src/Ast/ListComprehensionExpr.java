package Ast;

public class ListComprehensionExpr extends Expression {
    private Expression elementExpr;
    private String variable;
    private Expression iterable;
    private Expression condition;

    public ListComprehensionExpr(Expression elementExpr,
                                 String variable,
                                 Expression iterable,
                                 Expression condition,
                                 int lineNumber) {
        super("ListComprehensionExpr", lineNumber);
        this.elementExpr = elementExpr;
        this.variable = variable;
        this.iterable = iterable;
        this.condition = condition;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");

        printIndent(indent + 1);
        System.out.println("Element:");
        elementExpr.print(indent + 2);

        printIndent(indent + 1);
        System.out.println("Variable: " + variable);

        printIndent(indent + 1);
        System.out.println("Iterable:");
        iterable.print(indent + 2);

        if (condition != null) {
            printIndent(indent + 1);
            System.out.println("Condition:");
            condition.print(indent + 2);
        }
    }
}