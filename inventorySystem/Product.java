package inventorySystem;

/* 
 Design a class-based inventory system where classes like Product, Order, and
 Customer are created with constructors and encapsulation.
 */

public class Product {

    private String productName;
    private double price;
    private String productDescription;

    // Constructor
    public Product(String productName, double price, String productDescription) {
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for productDescription
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    // Getter for productDescription
    public String getProductDescription() {
        return productDescription;
    }

}
