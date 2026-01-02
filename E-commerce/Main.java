import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product(1, "32GB RAM", 14000, 4);
        Product p2 = new Product(2, "NVIDIA 3080 GPU", 180000, 2);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);

        Customer customer = new Customer(101, "Kushal", "kushalstha958@gmail.com", "1234");
        customer.register();
        customer.login();

        customer.viewProducts(products);

        customer.addToCart(p1, 4);
        customer.addToCart(p2, 2);

        customer.checkout();
    }
}
