package Ast;

import java.util.List;

public class Block extends Element{
    private List<Element>statements;

    public Block(String nodeName, int lineNumber, List<Element> statements) {
        super("Block", lineNumber);
        this.statements = statements;
    }
    public List<Element> getStatements() {
        return statements;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");
        for (Element s : statements) {
            s.print(indent + 1);
        }
    }
}
