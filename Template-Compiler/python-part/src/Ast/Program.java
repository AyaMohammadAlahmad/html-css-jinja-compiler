package Ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends Element {

    private List<Element> elements;

    public Program(int lineNumber) {
        super("Program", lineNumber);
        elements = new ArrayList<>();
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    @Override
    public void print(int indent) {

        printIndent(indent);
        System.out.println(nodeName + " (line " + lineNumber + ")");

        for (Element element : elements) {
            element.print(indent + 1);
        }
    }
}