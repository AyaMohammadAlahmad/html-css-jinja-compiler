package symbolTable;

public class Symbol {
    private String name;
    private int line;

    public Symbol(String name, int line) {
        this.name = name;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return name + " (line " + line + ")";
    }
}