package inventorySystem;

public class Customer {
    private String customerName;
    private String customerAddress;
    private int customerId;

    // Constructor
    public Customer(String customerName,String customerAddress,int customerId){
        this.customerName=customerName;
        this.customerAddress=customerAddress;
        this.customerId=customerId;
    }

    // Setter
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    // Getter
    public String getCustomerName(){
        return customerName;
    }
  // Setter
    public void setCustomerAddress(String customerAddress){
        this.customerAddress=customerAddress;
    }

    // Getter
    public String getCustomerAddress(){
        return customerAddress;
    }

      // Setter
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }

    // Getter
    public int getCustomerId(){
        return customerId;
    }



    
}
