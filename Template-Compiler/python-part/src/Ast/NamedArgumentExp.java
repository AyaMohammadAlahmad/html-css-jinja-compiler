package Ast;

public class NamedArgumentExp extends ArgumentExp {
    private String name;
    private Expression value;

    public NamedArgumentExp(String name, Expression value, int lineNumber) {
        super("NamedArgument", lineNumber);
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return name;
    }
    public Expression getValue()
    {return value;}
    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ") : " + name);

        if (value != null) {
            value.print(indent + 1);
        } else {
            printIndent(indent + 1);
            System.out.println("<null>");
        }
    }
}