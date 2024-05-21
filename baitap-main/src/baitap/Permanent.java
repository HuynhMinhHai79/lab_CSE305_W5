package baitap;

public class Permanent implements IContract {
    private String propertyID;
    private String contractID;
    private String tenantID;
    private double rentAmount;
    @Override
    public void BuidProperty(String propertyID) {
      this.propertyID = propertyID;
        
    }

    @Override
    public void BuildContract(String contractID) {
      this.contractID = contractID;
        
    }

    @Override
    public void BuildTenant(String tenantID) {
       this.tenantID = tenantID;
        
    }

    @Override
    public void RentAmount(double rentAmount) {
         this.rentAmount = rentAmount;
        
    }

    @Override
    public Contract signContract() {
        return new Contract(contractID, propertyID, tenantID, rentAmount);
    }

}