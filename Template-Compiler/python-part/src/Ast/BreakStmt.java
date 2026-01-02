package Ast;

public class BreakStmt extends Element {
    public BreakStmt(int lineNumber) {
        super("BreakStmt", lineNumber);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
    }
}