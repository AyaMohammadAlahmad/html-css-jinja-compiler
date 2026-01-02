package Ast;

import java.util.List;

public class ImportElement extends Element {

    private String module;
    private List<String> names;

    public ImportElement(String module, List<String> names, int lineNumber) {
        super("ImportElement", lineNumber);
        this.module = module;
        this.names = names;
    }

    @Override
    public void print(int indent) {

        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");

        printIndent(indent + 1);
        if (names == null || names.isEmpty()) {
            System.out.println("module = " + module);
        } else {
            System.out.println("module = " + module + ", names = " + names);
        }
    }
}