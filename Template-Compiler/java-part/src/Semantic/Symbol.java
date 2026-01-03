package Semantic;

public class Symbol {

    private String name;
    private SymbolKind kind;
    private int line;

    public Symbol(String name, SymbolKind kind, int line) {
        this.name = name;
        this.kind = kind;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public SymbolKind getKind() {
        return kind;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return kind + " " + name + " (line " + line + ")";
    }
}
