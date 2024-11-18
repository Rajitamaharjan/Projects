
/**
 * Write a description of class CreditCard here.
 *
 * @RajitaMaharjan
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard

{
    //declaring variables
    private int CVCnumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //constructor
    CreditCard(int cardID, String clientName, String issuerBank, String bankAccount,int balanceAmount, int CVCnumber, double interestRate, String expirationDate){
        super(cardID, balanceAmount, bankAccount, issuerBank);
        this.setbalanceAmount(balanceAmount);
        this.CVCnumber = CVCnumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted= false;
    }
    
    //accessor method
    public int getCVCnumber(){
        return this.CVCnumber;
    }
    
    public double getcreditLimit(){
        return this.creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getinterestRate(){
        return this.interestRate;
    }
    
    public String getexpirationDate(){
        return this.expirationDate;
    }
    
    public int getgracePeriod(){
        return this.gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public boolean getisGranted(){
        return this.isGranted;
    }
    
    //setCreditLimit method
    public void setcreditLimit(int creditLimit, int grace_period) {

        if (creditLimit <= (2.5 * super.getbalanceAmount())){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        }
        else{
            System.out.println("Credit cannot be issued");
        }
    }
    
    // cancelCreditCard method
    
    public void cancelcreditCard(){
        this.creditLimit = 0;
        this.CVCnumber = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    public void creditDisplay(){
        System.out.println("Interest rate is " + interestRate + "%.");
        System.out.println("CVC number is " + CVCnumber);
        System.out.println("Expiration date is " + expirationDate);
    }
    
    
    //display method
     public String display() {
         String message = super.display();
        if (isGranted) {
            message+= "\n Interest rate is: " + interestRate + "\nExpiration date is : " + expirationDate + "\nGrace period is : "
                    + gracePeriod + "\nCVC number is : " + CVCnumber + "\nCredit limit is : " + creditLimit;

        } else {
            message+= "\n Credit card has not been granted yet.";
        }
        return message;
    }
}

