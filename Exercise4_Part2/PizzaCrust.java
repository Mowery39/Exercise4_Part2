abstract class PizzaCrust {
    protected String type; // Ingredient type (e.g., "flour", "cauliflower")

    public PizzaCrust(String type) {
        this.type = type;
    }

    @SuppressWarnings("override")
    public abstract String toString();

    public String toNiceString() {
        return "Crust made of " + type + ": " + toString();
    }

    public String checkIntegrity() {
        return "";
    }
}
