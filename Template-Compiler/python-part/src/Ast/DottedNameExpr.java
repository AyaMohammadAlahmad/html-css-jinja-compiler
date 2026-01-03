package Ast;

import java.util.List;

public class DottedNameExpr extends Expression{

    private List<String> parts;

    public DottedNameExpr(List<String> parts, int lineNumber) {
        super("DottedNameExpr", lineNumber);
        this.parts = parts;
    }

    public List<String> getParts() {
        return parts;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (String p : parts) {
            printIndent(indent + 1);
            System.out.println(p);
        }
    }
}
