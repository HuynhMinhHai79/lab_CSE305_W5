package baitap;

public interface IContract {
    void BuildContract(String contractID);

    void BuidProperty(String propertyID);

    void BuildTenant(String tenantID);

    void RentAmount(double rentAmount);

    Contract signContract();

    
}
