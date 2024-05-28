package baitap;

public class LongTerm implements Contract {
    private String contractID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildContractID() {
        this.contractID = "LONG-" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public Contract signContract() {
        System.out.println("Long-term contract signed.");
        return this;
    }

    @Override
    public String getContractID() {
        return this.contractID;
    }
}