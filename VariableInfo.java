public class VariableInfo {
    public final String name;
    public final String type;
    public final boolean isParameter;

    public VariableInfo(String name, String type, boolean isParameter) {
        this.name = name;
        this.type = type;
        this.isParameter = isParameter;
    }

    @Override
    public String toString() {
        return String.format("%s : %s%s", name, type, isParameter ? " (param)" : "");
    }
}
