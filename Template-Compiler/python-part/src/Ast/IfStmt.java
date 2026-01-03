package Ast;

public class IfStmt extends Element{
    private Expression condition;
    private Block thenBlock;
    private Block elseBlock;

    public IfStmt(Expression condition,Block thenBlock,Block elseBlock,String nodeName, int lineNumber) {
        super(" IfStmt", lineNumber);
        this.condition=condition;
        this.thenBlock=thenBlock;
        this.elseBlock=elseBlock;
    }
    public Expression getCondition() {
        return condition;
    }

    public Block getThenBlock() {
        return thenBlock;
    }

    public Block getElseBlock() {
        return elseBlock;
    }

    @Override
    public void print(int indent) {

        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        printIndent(indent + 1);
        System.out.println("Condition:");
        condition.print(indent + 2);
        printIndent(indent + 1);
        System.out.println("Then:");
        thenBlock.print(indent + 2);
        if (elseBlock != null) {
            printIndent(indent + 1);
            System.out.println("Else:");
            elseBlock.print(indent + 2);
        }
    }
}
