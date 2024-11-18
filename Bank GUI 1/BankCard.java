
/**
 * Write a description of class BankCard here.
 *
 * @RajitaMaharjan
 * @version (a version number or a date)
 */
public class BankCard
{
    private String clientName;
    private String bankAccount;
    private String issuerBank;
    private int cardID;
    private int balanceAmount;

    
    
    //parameterized constructor//
    public BankCard(int balanceAmount, int cardID, String bankAccount, String issuerBank){
        this.balanceAmount = balanceAmount;
        this.cardID = cardID;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.clientName = "";
    }
    
    //getter method for the attributes
   
    public int getcardID(){
        return this.cardID;
    }
    
    
    public String getbankAccount(){
        return this.bankAccount;
    }
    
    
     public int getbalanceAmount(){
        return this.balanceAmount;
    }
    
    
    
    
    //setter method 
    
    public void setclientName(String clientName){
        this.clientName = clientName;
    }
    
    public void setbalanceAmount(int balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    
    
    //display method
    
    public void display() {
        
        if (clientName == "") {
            System.out.println("Error: Client name is not assigned");
        }
        
        else{
        System.out.println("Name of the client is: " + this.clientName);
        System.out.println("Card ID is :" + this.cardID);
        System.out.println("Issuer bank is: " + this.issuerBank);
        System.out.println("Bank account is: " + this.bankAccount);
        System.out.println("Balance amount is: " + this.balanceAmount);
    }
}
}









