package Semantic;

import java.util.*;

public class SymbolTable {

    private Map<String, Symbol> symbols = new LinkedHashMap<>();
    private SymbolTable parent;
    private List<SymbolTable> children = new ArrayList<>();

    public SymbolTable() {
        this.parent = null;
    }

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
        if (parent != null) {
            parent.children.add(this);
        }
    }

    public void add(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol lookup(String name) {
        if (symbols.containsKey(name)) return symbols.get(name);
        if (parent != null) return parent.lookup(name);
        return null;
    }

    public Symbol lookupLocal(String name) {
        return symbols.get(name);
    }

    public SymbolTable getParent() {
        return parent;
    }

    public void printHierarchy(String indent) {
        for (Symbol s : symbols.values()) {
            System.out.println(indent + s);
        }
        for (SymbolTable child : children) {
            child.printHierarchy(indent + "  ");
        }
    }
}
