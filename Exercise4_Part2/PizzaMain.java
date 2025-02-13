import java.util.Scanner;

public class PizzaMain {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choosing Crust Type
        System.out.println("Choose a crust (1: Thin Crust, 2: Thick Crust): ");
        int crustChoice = scanner.nextInt();

        System.out.println("Enter crust ingredient (e.g., flour, cauliflower): ");
        scanner.nextLine(); // Consume newline
        String crustType = scanner.nextLine();

        PizzaCrust crust;
        if (crustChoice == 2) {
            System.out.println("Should it be a deep dish? (true/false): ");
            boolean deepDish = scanner.nextBoolean();
            crust = new ThickCrust(crustType, deepDish);
        } else {
            crust = new ThinCrust(crustType);
        }

        // Choosing Sauce
        System.out.println("Choose a sauce (1: Tomato Sauce, 2: Alfredo Sauce): ");
        int sauceChoice = scanner.nextInt();
        PizzaSauce sauce = (sauceChoice == 1) ? new TomatoSauce() : new AlfredoSauce();

        // Creating Pizza
        Pizza pizza = new Pizza(crust, sauce);

        // Choosing Toppings
        System.out.println("Choose up to 4 toppings (Enter numbers, 0 to finish):");
        System.out.println("1: Sausage, 2: Pepperoni, 3: Chicken, 4: Beef, 5: Mushroom, 6: Pepper, 7: Tomato, 8: Spinach, 9: Mozzarella, 10: Cheddar, 11: Parmesan, 12: Provolone");

        int toppingsCount = 0;
        while (toppingsCount < 4) {
            int toppingChoice = scanner.nextInt();
            if (toppingChoice == 0) break;
            switch (toppingChoice) {
                case 1 -> pizza.addTopping(new Sausage());
                case 2 -> pizza.addTopping(new Pepperoni());
                case 3 -> pizza.addTopping(new Chicken());
                case 4 -> pizza.addTopping(new Beef());
                case 5 -> pizza.addTopping(new Mushroom());
                case 6 -> pizza.addTopping(new Pepper());
                case 7 -> pizza.addTopping(new Tomato());
                case 8 -> pizza.addTopping(new Spinach());
                case 9 -> pizza.addTopping(new Mozzarella());
                case 10 -> pizza.addTopping(new Cheddar());
                case 11 -> pizza.addTopping(new Parmesan());
                case 12 -> pizza.addTopping(new Provolone());
                default -> System.out.println("Invalid choice, try again.");
            }
            toppingsCount++;
        }

        scanner.close();

        // Display Final Pizza Order
        pizza.displayPizza();
    }
}
