abstract class PizzaTopping {
    @SuppressWarnings("override")
    public abstract String toString();

    public String toNiceString() {
        return "A delicious topping: " + toString();
    }
}