package symbolTable;

public class SymbolTablepy {

    private Scope currentScope;
    private int memoryCounter = 0;

    public SymbolTablepy() {
        allocate(); // Global scope
    }

    // allocate
    public void allocate() {
        currentScope = new Scope(currentScope);
    }

    // free
    public void free() {
        if (currentScope != null) {
            currentScope = currentScope.getParent();
        }
    }

    // insert
    public void insert(String name, String type, Object value) {
        String internalName = "_var" + memoryCounter++;
        VariableSymbol symbol =
                new VariableSymbol(name, type, value, internalName);
        currentScope.insert(symbol);
    }

    // lookup
    public VariableSymbol lookup(String name) {
        return currentScope.lookup(name);
    }

    // set_attribute
    public void setAttribute(String name, Object value) {
        currentScope.setAttribute(name, value);
    }

    // get_attribute
    public Object getAttribute(String name) {
        return currentScope.getAttribute(name);
    }

    // print symbol table
    public void print() {
        printScope(currentScope, 0);
    }

    private void printScope(Scope scope, int level) {
        if (scope == null) return;

        printScope(scope.getParent(), level + 1);

        System.out.println("Scope level " + level + ":");
        scope.print(level);
    }
}