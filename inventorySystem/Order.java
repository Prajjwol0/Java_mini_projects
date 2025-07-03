package inventorySystem;

public class Order {
    private int productId;
    private String productName;

    // Constructor
    public Order(int productId,String productName){
        this.productId=productId;
        this.productName=productName;
    }

    // Setter for productId:
    public void setProductId(int productId){
        this.productId=productId;
    }

    // Getter for productId:
    public int getProductId(){
        return productId;
    }

     // Setter for productName:
    public void setProductName(String productName){
        this.productName=productName;
    }

    // Getter for productName:
    public String getProductName(){
        return productName;
    }

}
