package Edurkal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int CustomerNumber;
    private int pinnumber;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("$##,###.00");

    

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
}
