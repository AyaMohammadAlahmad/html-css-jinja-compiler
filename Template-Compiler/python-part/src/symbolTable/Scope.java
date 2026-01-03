package symbolTable;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

public class Scope {

    private Map<String, VariableSymbol> symbols;
    private Scope parent;

    public Scope(Scope parent) {
        this.parent = parent;
        this.symbols = new HashMap<>();
    }

    // insert
    public void insert(VariableSymbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    // lookup
    public VariableSymbol lookup(String name) {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        }

        if (parent != null) {
            return parent.lookup(name);
        }

        return null;
    }

    // set_attribute
    public void setAttribute(String name, Object value) {
        VariableSymbol symbol = lookup(name);
        if (symbol != null) {
            symbol.setValue(value);
        }
    }

    // get_attribute
    public Object getAttribute(String name) {
        VariableSymbol symbol = lookup(name);
        return symbol != null ? symbol.getValue() : null;
    }

    public Scope getParent() {
        return parent;
    }

    public void print(int level) {
        String indent = "  ".repeat(level);
        for (VariableSymbol s : symbols.values()) {
            System.out.println(indent + s);
        }
    }
}
=======
public class Scope {
}
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6
