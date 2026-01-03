package Ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends Element {

    private List<Element> elements;

    public Program(int lineNumber) {
        super("Program", lineNumber);
        elements = new ArrayList<>();
    }
<<<<<<< HEAD
    public List<Element> getElements() {
        return elements;
    }
=======
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6

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