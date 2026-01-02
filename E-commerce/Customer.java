import java.util.List;

public class Customer {

    private final int customerId;
    private final String name;
    private final String email;
    private final String password;
    private final ShoppingCart cart;

    public Customer(int customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cart = new ShoppingCart();
    }

    public void register() {
        System.out.println("Customer registered successfully");
    }

    public boolean login() {
        System.out.println("Login successful");
        return true;
    }

    public void viewProducts(List<Product> products) {
        for (Product product : products) {
            product.getDetails();
            System.out.println();
        }
    }

    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    public void checkout() {
        System.out.println("Checkout successful");
        cart.viewCartItems();
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
