
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
        
            public String display() {
                
                if (clientName == "") {
                    return "Error: Client name is not assigned";
                }
                
                else{
                    return "Name of the client is: " + this.clientName + "\n" + "Card ID is :" + this.cardID + "\n" +
                            "Issuer bank is: " + this.issuerBank + "\n" + "Bank account is: " + this.bankAccount + "\n" +
                            "Balance amount is: " + this.balanceAmount;

            }
    }
    }
    
    
    
    
    
    
    
    
    
