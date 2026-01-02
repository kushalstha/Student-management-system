public class Product {

    private final int productId;
    private final String name;
    private final double price;
    private final int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void getDetails() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stockQuantity);
    }

    public boolean checkAvailability(int quantity) {
        return stockQuantity >= quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
