package Ast;

public class ForStmt extends Element {
    private String variable;
    private Expression iterable;
    private Block body;

    public ForStmt(String variable, Expression iterable, Block body, int lineNumber) {
        super("ForStmt", lineNumber);
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        printIndent(indent + 1);
        System.out.println("Variable: " + variable);
        printIndent(indent + 1);
        System.out.println("Iterable:");
        iterable.print(indent + 2);
        printIndent(indent + 1);
        System.out.println("Body:");
        body.print(indent + 2);
    }
}