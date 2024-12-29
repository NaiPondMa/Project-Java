package banking;
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
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (!loggedIn && attempts < MAX_ATTEMPTS) {
            try {
                data.put(98765432, 1567);
                data.put(945315, 5843);

                System.out.println("Welcome to ATM system made by Java");

                System.out.print("Enter customer number: ");
                setCustomNumber(menuInput.nextInt());

                System.out.print("Enter your Pin number: ");
                setPinNumber(menuInput.nextInt());

                // Validate login
                if (data.containsKey(getCustomerNumber()) && data.get(getCustomerNumber()).equals(getPinNumber())) {
                    loggedIn = true;
                    System.out.println("Login successful!");
                    getAccountType(); // Proceed to account type selection
                } else {
                    System.out.println("Invalid customer number or PIN. Please try again.");
                    attempts++;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid character(s). Only numbers are allowed." + "\n");
                menuInput.next(); // Clear invalid input
                attempts++;
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Exiting...");
            System.exit(0);
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
                 getCheckingWithdrawInput();
                 getAccountType();
                 break;
             case 3:
                 getCheckingDepositInput();
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
                 getCSavingWithdrawInput();
                 getAccountType();
                 break;
             case 3:
                 getCSavingDepositInput();
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
