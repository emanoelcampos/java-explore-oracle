package duck.choice;

public class ShopApp {

    public static void main(String[] args) {

        double tax = 0.2;
        double total;

        Customer customer1 = new Customer();
        customer1.name = "Pink";
        customer1.size = "S";

        System.out.println("Welcome to the Duck Shop " + customer1.name + "!");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("Item 1, " + item1.description + ", " + item1.price + " and " + item1.size);
        System.out.println("Item 2, " + item2.description + ", " + item2.price + " and " + item2.size);

        total = (2 * item2.price + item1.price) * (1 + tax);
        System.out.println("Total: " + total);

        int measurement = 3;

        switch (measurement) {
            case 1,2,3 -> customer1.size = "S";
            case 4, 5, 6 -> customer1.size = "M";
            case 7, 8, 9 -> customer1.size = "L";
            default -> customer1.size = "X";
        }
    }
}
