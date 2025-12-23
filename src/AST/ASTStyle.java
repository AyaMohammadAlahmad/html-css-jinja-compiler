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
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Style\n");

        for (String line : cssLines) {
            sb.append(indent).append("  ").append(line).append("\n");
        }
        return sb.toString();
    }
}
