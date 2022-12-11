import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProductNext {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Apple");
        p1.setPrice(0.99);
        p1.setQuantity(54);
        System.out.println(p1);

        Product p2 = new Product();
        p2.setName("Salmon");
        p2.setPrice(24.99);
        p2.setQuantity(7);
        System.out.println(p2);

        Product p3 = new Product();
        p3.setName("Cookies");
        p3.setPrice(2.99);
        p3.setQuantity(21);
        System.out.println(p3);

        Product p4 = new Product();
        p4.setName("Candles");
        p4.setPrice(0.99);
        p4.setQuantity(52);
        System.out.println(p4);

        double maxPrice = p1.getPrice();
        if(maxPrice< p2.getPrice())
        maxPrice= p2.getPrice();
        if(maxPrice< p3.getPrice())
        maxPrice= p3.getPrice();
        if(maxPrice< p4.getPrice())
            maxPrice= p4.getPrice();
        System.out.println("Product with a max price " + maxPrice);

        int maxQuantity = p1.getQuantity();
        if(maxQuantity< p2.getQuantity())
            maxQuantity=p2.getQuantity();
        if(maxQuantity< p3.getQuantity())
            maxQuantity=p3.getQuantity();
        if(maxQuantity< p4.getQuantity())
            maxQuantity=p4.getQuantity();
        System.out.println("Product with a max Quantity " + maxQuantity);
    }
}