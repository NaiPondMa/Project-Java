package banking;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("$##,###.00");

    // Setting Account Information //
    public int setCustomNumber(int CustomerNumber) {
        this.CustomerNumber = CustomerNumber;
        return CustomerNumber;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public int setPinNumber(int pinnumber) {
        this.pinnumber = pinnumber;
        return pinnumber;
    }

    public int getPinNumber() {
        return pinnumber;
    }

    // Setting Menu Account //
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    // Calculate Checking Account withdraw //
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    // Calculate Checking Account deposit //
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    // Checking Account Withdraw input //
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance :" + moneyformat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();
        if ((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Checking Account Withdraw input //
    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance :" + moneyformat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();
        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void getCSavingDepositInput() {
        System.out.println("Checking Account Balance :" + moneyformat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();
        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    
    // Checking Account Withdraw input //
    public void getCSavingWithdrawInput() {
        System.out.println("Checking Account Balance :" + moneyformat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();
        if ((checkingBalance - amount) >= 0){
            calcCheckingDeposit(amount);
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    
    private int CustomerNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    private int pinnumber;
}