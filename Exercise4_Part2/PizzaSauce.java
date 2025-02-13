abstract class PizzaSauce {
    @SuppressWarnings("override")
    public abstract String toString();

    public String toNiceString() {
        return "A flavorful sauce: " + toString();
    }
}