class ThickCrust extends PizzaCrust {
    private final boolean deepDish;

    public ThickCrust(String type, boolean deepDish) {
        super(type);
        this.deepDish = deepDish;
    }

    @Override
    public String toString() {
        return deepDish ? "Deep Dish Thick Crust" : "Regular Thick Crust";
    }

    @Override
    public String toNiceString() {
        return "Crust made of " + type + ": " + toString() + (deepDish ? " (Deep Dish Style)" : "");
    }

    @Override
    public String checkIntegrity() {
        if (type.equalsIgnoreCase("cauliflower")) {
            return "⚠️ Warning: This cauliflower-based thick crust might fall apart! Handle carefully.";
        }
        return "";
    }
}
