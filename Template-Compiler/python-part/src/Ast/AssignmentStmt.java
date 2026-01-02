package Ast;

public class AssignmentStmt extends Element {

    private String variable;
    private Expression value;

    public AssignmentStmt(String variable,
                          Expression value,
                          int lineNumber) {
        super("AssignmentStmt", lineNumber);
        this.variable = variable;
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        printIndent(indent + 1);
        System.out.println("Variable: " + variable);
        value.print(indent + 1);
    }
}