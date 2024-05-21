package baitap;



public class Client {
    public static void main(String[] args) {
        IContract shortTerm = new ShortTerm();
        shortTerm.BuidProperty("123");
        shortTerm.BuildContract("456");
        shortTerm.BuildTenant("789");
        shortTerm.RentAmount(1000);
        Contract shortTermContract = shortTerm.signContract();
        System.out.println(shortTermContract);
    }
}