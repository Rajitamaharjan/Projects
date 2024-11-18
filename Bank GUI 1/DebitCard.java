
/**
 * Write a description of class DebitCard here.
 *
 * @RajitaMaharjan
 * @version (a version number or a date)
 */

    public class DebitCard extends BankCard{
    
    //declaring the attributes
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
    
    //mutator method for withdrawal amount
    public void setwithdrawalAmount (int withdrawal_amount) {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    public void Withdraw (int withdrawalAmount, String dateOfWithdrawal, int pinNumber){
        this.dateOfWithdrawal = dateOfWithdrawal;
        
        if (pinNumber == this.pinNumber){
            if (withdrawalAmount < this.getbalanceAmount()){
                System.out.println("The amount is withdrawn.");
                
                this.setbalanceAmount(this.getbalanceAmount() - withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithdrawn = true;
            }
            else{
                System.out.println("Insufficient Balance");
            }
        } 
        else{
            System.out.println("Incorrect pin number");
        }
    }
    
    public void display() {
        super.display();
        if (hasWithdrawn == true) {
            System.out.println("Pin number is :" + this.pinNumber + ".");
            System.out.println("Withdrawn amount is : " + this.withdrawalAmount + ".");
            System.out.println("Date of withdrawal is : " + dateOfWithdrawal + ".");
        }
        else {
            System.out.println("Balance Amount is " + getbalanceAmount());
        }
    }
}

