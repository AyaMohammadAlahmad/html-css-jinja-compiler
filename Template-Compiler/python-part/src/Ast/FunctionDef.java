package Ast;

import java.util.List;

public class FunctionDef extends Element {

    private String name;           // اسم الدالة
    private List<String> parameters; // أسماء المعاملات
    private Block body;             // جسم الدالة

    public FunctionDef(String name,
                       List<String> parameters,
                       Block body,
                       int lineNumber) {
        super("FunctionDef", lineNumber);
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }
    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Block getBody() {
        return body;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + name);

        printIndent(indent + 1);
        System.out.println("Parameters: " + parameters);

        printIndent(indent + 1);
        System.out.println("Body:");
        body.print(indent + 2);
    }
}