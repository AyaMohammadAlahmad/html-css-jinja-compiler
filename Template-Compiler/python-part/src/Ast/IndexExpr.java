package Ast;

public class IndexExpr extends Expression{
    private Expression target;
    private Expression index;

    public IndexExpr(Expression target, Expression index, int lineNumber) {
        super("IndexExpr", lineNumber);
        this.target = target;
        this.index = index;
    }
    public Expression getTarget() {
        return target;
    }

    public Expression getIndex() {
        return index;
    }

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
