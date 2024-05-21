package baitap;


import java.util.ArrayList;
import java.util.List;

public class Tenant extends user {

    public Tenant(int id, String name, String email, String phoneNumber, String password) {
        super(id, name, email, phoneNumber, password);
        //TODO Auto-generated constructor stub
    }

    private ArrayList<RentalContract> rentedProperties;
    private String TenantID;

   
    // public Tenant(UserBuilder builder) {
    // super(builder);
    // }
    public void setRentedProperties(ArrayList<RentalContract> rentedProperties) {
        this.rentedProperties = rentedProperties;
    }

   

    public List<RentalContract> getRentedProperties() {
        return new ArrayList<>(rentedProperties); // Return a copy to prevent external modification
    }

    public Tenant getTenant() {
        return this;
    }

    // public void createRentalContract(Property property, int durationMonths) {
    //
    // RentalContract newContract = new RentalContract(property, durationMonths);
    // rentedProperties.add(newContract);
    //
    // System.out.println("Rental contract created successfully.");
    // }
    public void terminateRentalContract(RentalContract contract) {
    

}
}