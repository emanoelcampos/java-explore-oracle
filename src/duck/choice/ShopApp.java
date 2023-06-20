package duck.choice;

public class ShopApp {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setName("Pink");;
        customer1.setSize(3);

        System.out.println("Welcome to the Duck Shop " + customer1.getName() + "!");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        Clothing[] items = {item1, item2, item3, item4};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");

        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        customer1.addItems(items);
        System.out.println("Customer is " + customer1.getName() + ", " + customer1.getSize() + ", " + customer1.getTotalClothingCost());
        for(Clothing item : customer1.getItems()) {
            System.out.println("Items " + item.getDescription());
        }

    }
}
