package inventorySystem;

public class InventorySystem {
    
    public static void main(String[] args) {

        Product product=new Product("Laptop",100000,"Very good laptop");

        Order order=new Order(1,"Acer Nitro 5");

        Customer customer=new Customer("Sashank Napit", "Banepa",911);
    

System.out.println("Product Name: "+product.getProductName() );        
System.out.println("Product Price: "+product.getPrice() );        
System.out.println("About: "+product.getProductDescription());

System.out.println("Ordered by: "+customer.getCustomerName());
System.out.println("Ordered Location: "+customer.getCustomerAddress());


System.out.println("Ordered by: "+order.getProductId());

    }
}
