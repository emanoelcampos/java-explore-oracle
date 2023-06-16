package duck.choice;

public class Clothing {

    private String description;
    private double price;
    private String size = "M";
    private final double MINIMAL_PRICE = 10.0;
    private final double TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * getTAX());
    }

    public void setPrice(double price) {

       //this.price = (price >= getMINIMAL_PRICE()) ? price : getMINIMAL_PRICE();

        if(price >= getMINIMAL_PRICE()) {
            this.price = price;
        } else {
           this.price = getMINIMAL_PRICE();
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getMINIMAL_PRICE() {
        return MINIMAL_PRICE;
    }

    public double getTAX() {
        return TAX;
    }
}
