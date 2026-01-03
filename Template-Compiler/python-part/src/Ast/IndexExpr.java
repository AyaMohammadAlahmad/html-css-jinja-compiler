package Ast;

public class IndexExpr extends Expression{
    private Expression target;
    private Expression index;

    public IndexExpr(Expression target, Expression index, int lineNumber) {
        super("IndexExpr", lineNumber);
        this.target = target;
        this.index = index;
    }
<<<<<<< HEAD
    public Expression getTarget() {
        return target;
    }

    public Expression getIndex() {
        return index;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        printIndent(indent + 1); System.out.println("Target:");
        target.print(indent + 2);
        printIndent(indent + 1); System.out.println("Index:");
        index.print(indent + 2);
    }
}
