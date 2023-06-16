package duck.choice;

public class ShopApp {

    public static void main(String[] args) {

        double total = 0.0;

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

        //System.out.println("Item 1, " + item1.description + ", " + item1.price + " and " + item1.size);
        //System.out.println("Item 2, " + item2.description + ", " + item2.price + " and " + item2.size);

        //total = (2 * item2.price + item1.price) * (1 + tax);


        for(Clothing item : items) {
            if(customer1.getSize().equals(item.getSize())) {
                total += item.getPrice();
                System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + " and " + item.getSize());
                if(total > 15){break;}
            }
        }

        System.out.println("TOTAL: " + total);


    }
}
