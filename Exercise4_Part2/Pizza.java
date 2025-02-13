import java.util.ArrayList;
import java.util.List;

class Pizza {
    private final PizzaCrust crust;
    private final PizzaSauce sauce;
    private final List<PizzaTopping> toppings;

    public Pizza(PizzaCrust crust, PizzaSauce sauce) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(PizzaTopping topping) {
        if (toppings.size() < 4) {
            toppings.add(topping);
        } else {
            System.out.println("Cannot add more than 4 toppings.");
        }
    }

    public void displayPizza() {
        System.out.println("Your Pizza:");
        System.out.println(crust.toNiceString());
        System.out.println(sauce.toNiceString());
        System.out.println("Toppings:");
        for (PizzaTopping topping : toppings) {
            System.out.println("- " + topping.toNiceString());
        }

        String integrityMessage = crust.checkIntegrity();
        if (!integrityMessage.isEmpty()) {
            System.out.println(integrityMessage);
        }
    }
}
