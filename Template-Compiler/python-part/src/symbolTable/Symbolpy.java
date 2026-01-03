package symbolTable;

public class Symbolpy {

    protected String name;
    protected String type;

    public Symbolpy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}