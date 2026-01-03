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
<<<<<<< HEAD
    public String getVariable() {
        return variable;
    }

    public Expression getIterable() {
        return iterable;
    }

    public Block getBody() {
        return body;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

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