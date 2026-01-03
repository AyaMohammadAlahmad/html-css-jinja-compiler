package Ast;

public abstract class Expression extends Element {
    public Expression(String nodeName, int lineNumber) {
        super(nodeName, lineNumber);
    }

    // كل Expression يجب أن يعرف كيف يطبع نفسه
    @Override
    public abstract void print(int indent);
}