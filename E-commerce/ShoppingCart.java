import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<Product, Integer> cartItems;
    private double totalPrice;

    public ShoppingCart() {
        cartItems = new HashMap<>();
        totalPrice = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            calculateTotalPrice();
        } else {
            System.out.println("Product out of stock");
        }
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
        calculateTotalPrice();
    }

    public double calculateTotalPrice() {
        totalPrice = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public void viewCartItems() {
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().getName() + " x " + entry.getValue());
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
