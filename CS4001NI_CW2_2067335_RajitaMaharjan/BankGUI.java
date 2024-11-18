import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;

/**
 * Write a description of class BankGUI here.
 *
 * Rajita Maharjan
 * @version (a version number or a date)
 */
public class BankGUI
{
    JFrame jf;
    JPanel jp;
    JTextField tf1, tf2, tf3, tf4,tf5, tf6, tf7, tf8, tf9, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf19, tf20, tf21, tf22;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19, lb20, lb21, lb22, heading1, heading2;
    JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
    public BankGUI()
    {
        jf = new JFrame("Frame Name");
        jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.WHITE);
        
        heading1 = new JLabel("Debit Card");
        heading1.setFont(new Font("Arial, ", Font.BOLD, 24));
        heading1.setBounds(206, 12, 170, 36);
        heading1.setForeground(Color.BLACK);

        jp.add(heading1);
        heading2 = new JLabel("Credit Card");
        heading2.setFont(new Font("Arial", Font.BOLD, 24));
        heading2.setBounds(837, 12, 178, 38);
        heading2.setForeground(Color.BLACK);

        jp.add(heading2);


        jf.add(jp);
                            
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf11 = new JTextField();
        tf12 = new JTextField();
        tf13 = new JTextField();
        tf14 = new JTextField();
        tf15 = new JTextField();
        tf16 = new JTextField();
        tf17 = new JTextField();
        tf19 = new JTextField();
        tf20 = new JTextField();
        tf21 = new JTextField();
        tf22 = new JTextField();
        
      
        tf1.setBounds(254, 76, 245, 23);
        tf1.setBackground(new Color(247, 250, 222));

        tf2.setBounds(254, 127, 245, 23);
        tf2.setBackground(new Color(247, 250, 222));
        
        tf3.setBounds(254, 178, 245, 23);
        tf3.setBackground(new Color(247, 250, 222));
        
        tf4.setBounds(254, 229, 245, 23);
        tf4.setBackground(new Color(247, 250, 222));

        tf5.setBounds(254, 280, 245, 23);
        tf5.setBackground(new Color(247, 250, 222));
        
        tf6.setBounds(254, 331, 245, 23);
        tf6.setBackground(new Color(247, 250, 222));
        
        tf7.setBounds(254, 483, 246, 28);
        tf7.setBackground(new Color(233, 250, 222));

        tf8.setBounds(254, 543, 246, 28);
        tf8.setBackground(new Color(233, 250, 222));
        
        tf9.setBounds(254, 604, 246, 28);
        tf9.setBackground(new Color(233, 250, 222));

        tf11.setBounds(917, 76, 259, 25);
        tf11.setBackground(new Color(212, 227, 252));
        
        tf12.setBounds(917, 119, 259, 25);
        tf12.setBackground(new Color(212, 227, 252));
        
        tf13.setBounds(917, 162, 259, 25);
        tf13.setBackground(new Color(212, 227, 252));

        tf14.setBounds(917, 205, 259, 25);
        tf14.setBackground(new Color(212, 227, 252));
        
        tf15.setBounds(917, 248, 259, 25);
        tf15.setBackground(new Color(212, 227, 252));
        
        tf16.setBounds(917, 291, 259, 25);
        tf16.setBackground(new Color(212, 227, 252));

        tf17.setBounds(917, 334, 259, 25);
        tf17.setBackground(new Color(212, 227, 252));
        
        tf19.setBounds(916, 495, 246, 28);
        tf19.setBackground(new Color(255, 226, 216));

        tf20.setBounds(916, 547, 246, 28);
        tf20.setBackground(new Color(255, 226, 216));
        
        tf21.setBounds(916, 599, 246, 28);
        tf21.setBackground(new Color(255, 226, 216));

        tf22.setBounds(916, 683, 246, 28);
        tf22.setBackground(new Color(255, 226, 216));


      
      
        jp.add(tf1);
        jp.add(tf2);
        jp.add(tf3);
        jp.add(tf4);
        jp.add(tf5);
        jp.add(tf6);
        jp.add(tf7);
        jp.add(tf8);
        jp.add(tf9);
        jp.add(tf11);
        jp.add(tf12);
        jp.add(tf13);
        jp.add(tf14);
        jp.add(tf15);
        jp.add(tf16);
        jp.add(tf17);
        jp.add(tf19);
        jp.add(tf20);        
        jp.add(tf21);
        jp.add(tf22);

        lb1 = new JLabel("Name");
        lb1.setForeground(Color.BLACK);
        
        lb2 = new JLabel("Card ID");
        lb2.setForeground(Color.BLACK);
        
        lb3 = new JLabel("Bank Account");
        lb3.setForeground(Color.BLACK);
         
        lb4 = new JLabel("Issuer Bank ");
        lb4.setForeground(Color.BLACK);
        
        lb5 = new JLabel("Pin Number");
        lb5.setForeground(Color.BLACK);
        
        lb6 = new JLabel("Balance Amount");
        lb6.setForeground(Color.BLACK);
        
        lb7 = new JLabel("Card ID");
        lb7.setForeground(Color.BLACK);
        
        lb8 = new JLabel("Withdrawal Amount");
        lb8.setForeground(Color.BLACK);
        
        lb9 = new JLabel("Pin Number");
        lb9.setForeground(Color.BLACK);
        
        lb10 = new JLabel("Date of Withdrawal");
        lb10.setForeground(Color.BLACK);
        
        lb11 = new JLabel("Name");
        lb11.setForeground(Color.BLACK);
        
        lb12 = new JLabel("Card ID");
        lb12.setForeground(Color.BLACK);
        
        lb13 = new JLabel("Bank Account");
        lb13.setForeground(Color.BLACK);
        
        lb14 = new JLabel("Issuer Bank");
        lb14.setForeground(Color.BLACK);
        
        lb15 = new JLabel("Interest Rate");
        lb15.setForeground(Color.BLACK);
        
        lb16 = new JLabel("Balance Amount");
        lb16.setForeground(Color.BLACK);
        
        lb17 = new JLabel("CVC Number");
        lb17.setForeground(Color.BLACK);
        
        lb18 = new JLabel("Expiry Date");
        lb18.setForeground(Color.BLACK);
        
        lb19 = new JLabel("Card ID");
        lb19.setForeground(Color.BLACK);
        
        lb20 = new JLabel("Grace Period");
        lb20.setForeground(Color.BLACK);
        
        lb21 = new JLabel("Credit Limit");
        lb21.setForeground(Color.BLACK);

        lb22 = new JLabel("Card ID");
        lb22.setForeground(Color.BLACK);
  
      
        lb1.setBounds(41, 76, 105, 22);
        lb2.setBounds(41, 127, 105, 22);
        lb3.setBounds(41, 178, 105, 22);
        lb4.setBounds(41, 229, 105, 22);
        lb5.setBounds(41, 280, 105, 22);
        lb6.setBounds(41, 331, 105, 22);
        lb7.setBounds(41, 483, 106, 28);
        lb8.setBounds(41, 543, 160, 22);
        lb9.setBounds(41, 604, 106, 28);
        lb10.setBounds(41, 665, 146, 27);
        lb11.setBounds(695, 76, 112, 23);
        lb12.setBounds(695, 119, 112, 23);
        lb13.setBounds(695, 162, 112, 23);
        lb14.setBounds(695, 205, 112, 23);
        lb15.setBounds(695, 248, 112, 23);
        lb16.setBounds(695, 291, 112, 23);
        lb17.setBounds(695, 334, 112, 23);
        lb18.setBounds(695, 377, 112, 23);
        lb19.setBounds(695, 495, 113, 31);
        lb20.setBounds(695, 547, 113, 31);
        lb21.setBounds(695, 599, 113, 31);
        lb22.setBounds(695, 680, 113, 31);
        
        
      
        jp.add(lb1);
        jp.add(lb2);
        jp.add(lb3);
        jp.add(lb4);
        jp.add(lb5);
        jp.add(lb6);
        jp.add(lb7);
        jp.add(lb8);
        jp.add(lb9);
        jp.add(lb10);
        jp.add(lb11);
        jp.add(lb12);
        jp.add(lb13);
        jp.add(lb14);
        jp.add(lb15);
        jp.add(lb16);
        jp.add(lb17);
        jp.add(lb18);
        jp.add(lb19);
        jp.add(lb20);
        jp.add(lb21);
        jp.add(lb22);
       
      
      
      
        jb1 = new JButton("Clear");
        jb2 = new JButton("Add");
        jb3 = new JButton("Display");
        jb4 = new JButton("Withdraw");
        jb5 = new JButton("Clear");
        jb6 = new JButton("Display");
        jb7 = new JButton("Add");
        jb8 = new JButton("Set Limit");
        jb9 = new JButton("Cancel card");
        jb10 = new JButton("Clear");
        jb11 = new JButton("Clear");


        jb1.setBounds(41, 388, 86,30 );
        jb2.setBounds(235, 388, 86, 30);
        jb3.setBounds(413, 388, 86, 30);
        jb4.setBounds(331, 716, 170, 30);
        jb5.setBounds(695, 444, 86, 30);
        jb6.setBounds(886, 444, 86, 30);
        jb7.setBounds(1064, 444, 112, 30);
        jb8.setBounds(695, 645, 184, 20);
        jb9.setBounds(871, 722, 144, 24);
        jb10.setBounds(41, 716, 86, 30);
        jb11.setBounds(1076, 645, 86, 20);
      
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jp.add(jb5);
        jp.add(jb6);
        jp.add(jb7);
        jp.add(jb8);
        jp.add(jb9);
        jp.add(jb10);
        jp.add(jb11);

        //cb1 will contain list of years
        String[] years = {"2019", "2020", "2021", "2022", "2023","2024","2025","2026","2027","2028","2029","2030"};
        String[] months = {"January", "February", "March", "April","May","June","July","August","September","October","November","December"};
        String[] days = {"1", "2", "3", "4", "5", "6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30","31"};
        cb1 = new JComboBox(years);
        cb2 = new JComboBox(months);
        cb3 = new JComboBox(days);
        cb4 = new JComboBox(years);
        cb5 = new JComboBox(months);
        cb6 = new JComboBox(days);

        cb1.setBounds(917, 377, 80, 22);
        cb2.setBounds(997, 377, 80, 22);
        cb3.setBounds(1077, 377, 80, 22);
        cb4.setBounds(254, 665, 80, 22);
        cb5.setBounds(334, 665, 80, 22);
        cb6.setBounds(414, 665, 80, 22);

        jp.add(cb1);
        jp.add(cb2);
        jp.add(cb3);
        jp.add(cb4);
        jp.add(cb5);
        jp.add(cb6);

        jp.setVisible(true);
        jp.setSize(500,900);
        jf.setSize(1228, 1080);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<BankCard> bankCards = new ArrayList<BankCard>();
        //add debit card
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get input values from GUI

                int balanceAmount;
                int cardId;
                int pinNumber;
                String bankAccount = tf3.getText();
                String issuerBank = tf4.getText();
                String clientName = tf1.getText();
                try {
                    balanceAmount = Integer.parseInt(tf6.getText());
                    cardId = Integer.parseInt(tf2.getText());
                    pinNumber = Integer.parseInt(tf5.getText());
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Invalid input values. Please check and try again.");
                    return;
                }

                // Create new DebitCard object with input values
                DebitCard debitCard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);

                // Add new DebitCard object to ArrayList of BankCard objects
                bankCards.add(debitCard);
                JOptionPane.showMessageDialog(null, "Debit card added successfully.");
            }
        });

        // clear values from debit card fields
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
            }
        });
        //debit card display
        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int cardId;
                String clientName = tf1.getText();
                try{
                    cardId = Integer.parseInt(tf2.getText());
                }catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Invalid input values. Please check and try again.");
                    return;
                }

                DebitCard debitCard = null;
                for (BankCard card : bankCards) {
                    if (card instanceof DebitCard &&   card.getcardID() == cardId) {
                        debitCard = (DebitCard) card;
                        debitCard.setclientName(clientName);
                        break;
                    }
                }

            // If a matching DebitCard object is found, display its information
                if (debitCard != null) {
                    JOptionPane.showMessageDialog(null, debitCard.display());
                } else {
                    JOptionPane.showMessageDialog(null, "Debit card not found");
                }
            }
        });
        //withdraw
        jb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dateOfWithdrawal=cb4.getSelectedItem().toString()+"-"+cb5.getSelectedItem().toString()+"-"+cb6.getSelectedItem().toString();
                int cardId;
                int pinNumber;
                int withdrawalAmount;
                try {
                    withdrawalAmount = Integer.parseInt(tf8.getText());
                    cardId = Integer.parseInt(tf7.getText());
                    pinNumber = Integer.parseInt(tf9.getText());
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Invalid input values. Please check and try again.");
                    return;
                }

                DebitCard debitCard = null;
                for (BankCard bankCard : bankCards) {
                    if (bankCard instanceof DebitCard && bankCard.getcardID() == cardId) {
                        debitCard = (DebitCard) bankCard;
                        break;
                    }
                }
                if (debitCard != null) {
                    String message = debitCard.Withdraw(withdrawalAmount,dateOfWithdrawal,pinNumber);
                    JOptionPane.showMessageDialog(null, message);
                } else {
                    JOptionPane.showMessageDialog(null, "Debit card not found");
                }

            }
        });


        // clear values from debit card fields
        jb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf11.setText("");
                tf12.setText("");
                tf13.setText("");
                tf14.setText("");
                tf15.setText("");
                tf16.setText("");
                tf17.setText("");
                cb1.setSelectedIndex(0);
                cb2.setSelectedIndex(0);
                cb3.setSelectedIndex(0);
            }
        });
        //display credit card
        jb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int cardId;
                String clientName = tf11.getText();
                try{
                    cardId = Integer.parseInt(tf12.getText());
                }catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Invalid input values. Please check and try again.");
                    return;
                }

                CreditCard creditCard = null;
                for (BankCard card : bankCards) {
                    if (card instanceof CreditCard && card.getcardID() == cardId) {
                        creditCard = (CreditCard) card;
                        break;
                    }
                }

                // If a matching DebitCard object is found, display its information
                if (creditCard != null) {
                    creditCard.setclientName(clientName);
                    JOptionPane.showMessageDialog(null, creditCard.display());
                } else {
                    JOptionPane.showMessageDialog(null, "Credit card not found");
                }
            }
        });
        //add credit card
        jb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get inputs from text fields
                int cardId, balanceAmount, cvcNumber;
                double interestRate;
                String clientName = tf11.getText();
                String issuerBank = tf13.getText();
                String bankAccount = tf14.getText();

                String expirationDate = cb1.getSelectedItem().toString() + "-" + cb2.getSelectedItem().toString() + "-" + cb3.getSelectedItem().toString();

                try {
                    cardId = Integer.parseInt(tf12.getText());
                    balanceAmount = Integer.parseInt(tf16.getText());
                    cvcNumber = Integer.parseInt(tf17.getText());
                    interestRate = Double.parseDouble(tf15.getText());
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Invalid input values. Please check and try again.");
                    return;
                }

                // Create a new CreditCard object
                CreditCard creditCard = new CreditCard(balanceAmount, clientName, bankAccount, issuerBank, cardId, cvcNumber, interestRate, expirationDate);

                // Add the new CreditCard object to the array list of BankCard class
                bankCards.add(creditCard);

                // Display a success message
                JOptionPane.showMessageDialog(null, "Credit card added successfully");
            }
        });

        //set limit to credit card
        jb8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get the input values
                int cardId,creditLimit,gracePeriod;
                try{
                     cardId = Integer.parseInt(tf19.getText());
                     creditLimit = Integer.parseInt(tf21.getText());
                     gracePeriod = Integer.parseInt(tf20.getText());
                }catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Invalid input values. Please check and try again.");
                    return;
                }


                // find the credit card with the given card ID
                CreditCard creditCard = null;
                for (BankCard bankCard : bankCards) {
                    if (bankCard instanceof CreditCard && bankCard.getcardID() == cardId) {
                        creditCard = (CreditCard) bankCard;
                        break;
                    }
                }

                // update the credit limit if a valid credit card is found
                if (creditCard != null) {
                    creditCard.setcreditLimit(creditLimit,gracePeriod);

                    // show a message dialog with the updated credit limit and grace period
                    JOptionPane.showMessageDialog(null, "Credit limit updated to " + creditLimit
                            + " and grace period updated to " + gracePeriod + ".");
                } else {
                    // show an error message if the card ID is invalid
                    JOptionPane.showMessageDialog(null, "Invalid card ID.");
                }
            }
        });
        //cancel credit card
        jb9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int cardId;
                try{
                    cardId = Integer.parseInt(tf22.getText());
                }catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Invalid input values. Please check and try again.");
                    return;
                }
                boolean foundCard = false;
                for (BankCard card : bankCards) {
                    if (card.getcardID() == cardId) {
                        foundCard = true;
                        // Cast the BankCard object as a CreditCard object
                        CreditCard creditCard = (CreditCard) card;
                        creditCard.cancelcreditCard();
                        JOptionPane.showMessageDialog(null, "Credit card " + cardId + " has been cancelled.");
                        break;
                    }
                }
                if (!foundCard) {
                    JOptionPane.showMessageDialog(null, "Invalid card ID.");
                }
            }
        });
        // clear fields related to withdraw
        jb10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                cb4.setSelectedIndex(0);
                cb5.setSelectedIndex(0);
                cb6.setSelectedIndex(0);
            }
        });
        //clear fields related to set limit
        jb11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf19.setText("");
                tf20.setText("");
                tf21.setText("");
            }
        });

    }



    
      public static void main(String [] args){
        new BankGUI();
        System.out.println();
      }
    
}


