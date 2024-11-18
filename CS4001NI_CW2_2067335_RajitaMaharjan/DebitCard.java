
/**
 * Write a description of class DebitCard here.
 *
 * @RajitaMaharjan
 * @version (a version number or a date)
 */

    public class DebitCard extends BankCard{
    
    //declaring the attributes
    private int cardId;
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor for Debit card
    DebitCard(int balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber){
        super(balanceAmount, cardID, bankAccount,issuerBank);
        super.setclientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    
    //accessor method
    public int getCardId() {
        return cardId;
    }
    public boolean withdraw(double amount) {
        return true;
    }
     public int getpinNumber() {
        return this.pinNumber;
    }
    
    public int getwithdrawalAmount() {
        return this.withdrawalAmount;
    }
    
    public String getdateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }
    
    public boolean gethasWithdrawn() {
        return this.hasWithdrawn;
    }
    
     public boolean validatePin(String pin) {
       return true; 
    }  
    
    //mutator method for withdrawal amount
    public void setwithdrawalAmount (int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    public String Withdraw (int withdrawalAmount, String dateOfWithdrawal, int pinNumber){
        this.dateOfWithdrawal = dateOfWithdrawal;

        if (pinNumber == this.pinNumber){
            if (withdrawalAmount < this.getbalanceAmount()){

                this.setbalanceAmount(this.getbalanceAmount() - withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithdrawn = true;
                this.withdrawalAmount= withdrawalAmount;
                return "The amount is withdrawn "+withdrawalAmount;
            }
            else{
                return "Insufficient Balance";
            }
        } 
        else{
            return "Incorrect pin number";
        }
    }
    
    public String display() {
        String message = super.display();
        if (this.hasWithdrawn) {
            message+= "\n Pin number is :" + this.pinNumber + ".\nWithdrawn amount is : " + this.getwithdrawalAmount() + ".\nDate of withdrawal is : " + dateOfWithdrawal ;
        }
        else {
            message+=  "\n Balance Amount is " + getbalanceAmount();
        }
        return message;
    }
}

