public class Product {
    private String name;
    private double price;
    private int quantity;


    //constructor


    public Product() {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    //setters
    public Product setPrice(double price) {
        this.price = price;

        return null;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    {


    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
