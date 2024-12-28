package Edurkal;
// Main Class
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat(" '$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    private void handleAccountOperations(String accountType){
        System.out.println(accountType + " Account accessed successfully.");
    }
    // Validate Login information customer number and pinnumber//

    public void getLogin() throws IOException {
        boolean loggedIn = false;
        while (!loggedIn) {
            try {
                data.put(98765432, 1567);
                data.put(945315, 5843);

                System.out.println("Welcome to ATM system made by Java");

                System.out.print("Enter customer number :");
                setCustomNumber(menuInput.nextInt());

                System.out.print("Enter your Pin number : ");
                setPinNumber(menuInput.nextInt());

                loggedIn = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid character(s). Only numbers" + "\n");
                menuInput.next();
            }
        }
    }
    
    // Display Account Type Menu with selection //
    public void getAccountType() {
        System.out.println("Select your accessability of your account :");
        System.out.println("Type 1 : Checking Account");
        System.out.println("Type 2 : Saving Account");
        System.out.println("Type 3 : Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("You have selected Checking Account");
                getChecking();
                break;
            case 2:
                System.out.println("You have selected Saving Money");
                getSaving();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid selection");
                getAccountType();
        }
    }
    
     // This is first menu checking account //
     public void getChecking() {
         handleAccountOperations("Checking");
         System.out.println("Select menu in session of checking account.");
         System.out.println("Type 1 : View Balance");
         System.out.println("Type 2 : Withdraw Funds");
         System.out.println("Type 3 : Deposit Funds");
         System.out.println("Type 4 : Exit");

         int selection = menuInput.nextInt();

         switch (selection) {
             case 1:
                 getCheckingBalance();
                 getAccountType();
                 break;
             case 2:
                 getWithdrawal();
                 getAccountType();
                 break;
             case 3:
                 getDeposit();
                 getAccountType();
                 break;
             case 4:
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid selection");
                 getChecking();
         }
     }
    
     public void getSaving() {
         handleAccountOperations("Savings");
         System.out.println("Type 1 : View Balance");
         System.out.println("Type 2 : Withdraw Funds");
         System.out.println("Type 3 : Deposit Funds");
         System.out.println("Type 4 : Exit");

         int selection = menuInput.nextInt();

         switch (selection) {
             case 1:
                 System.out.println("Saving Account Balance: " + moneyformat.format(getSavingBalance()));
                 getAccountType();
                 break;
             case 2:
                 getSavingWithdrawInput();
                 getAccountType();
                 break;
             case 3:
                 getSavingDepositInput();
                 getAccountType();
                 break;
             case 4:
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid selection");
                 getSaving();
             
            
         }
        
     }
   
    
}
