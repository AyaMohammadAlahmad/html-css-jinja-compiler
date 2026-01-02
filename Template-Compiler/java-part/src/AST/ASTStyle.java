package AST;

import java.util.ArrayList;
import java.util.List;

public class ASTStyle extends ContentNode {

    private List<String> cssLines;

    public ASTStyle(int line) {
        super(line);
        this.cssLines = new ArrayList<>();
    }

    public void addCssLine(String css) {
        cssLines.add(css);
    }

    @Override
    public String print(String indent) {
        return indent
                + getClass().getSimpleName()
                + " (line "
                + line
                + ")\n";
    }

}
