package Ast;

public abstract class Element {

    protected String nodeName;
    protected int lineNumber;

    public Element(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }

    protected void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }

    // كل عنصر يطبع نفسه
    public abstract void print(int indent);
}