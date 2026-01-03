package symbolTable;

public class VariableSymbol extends Symbolpy {

    private Object value;
    private String internalName;

    public VariableSymbol(String name, String type, Object value, String internalName) {
        super(name, type);
        this.value = value;
        this.internalName = internalName;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getInternalName() {
        return internalName;
    }

    @Override
    public String toString() {
        return name + " : " + type + " = " + value + " (" + internalName + ")";
    }
}