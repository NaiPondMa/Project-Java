# Banking Account Project

This project is a basic Java application that simulates a simple banking account system. It allows users to create accounts, deposit funds, withdraw money, and check account details. This project is ideal for beginners learning Java.

## Features

- Create a new bank account
- Deposit funds into the account
- Withdraw funds from the account
- Check account balance
- View account details

## Prerequisites

To run this project, you will need:

- Java Development Kit (JDK) version 8 or later
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or Visual Studio Code

## Project Structure

The project includes the following components:

1. **BankAccount.java** - Contains the main class representing the bank account and its functionalities.
2. **Main.java** - Entry point for the application with a simple menu-driven interface.
3. **README.md** - This file, providing an overview of the project.

## How to Run the Project

1. Clone or download the project files to your computer.
2. Open the project in your preferred IDE.
3. Compile and run the `Main.java` file.
4. Follow the on-screen menu to interact with the banking system.

## Sample Code

Here is an example of the `BankAccount` class:

```java
public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
```

## Future Enhancements

- Add support for multiple accounts
- Implement file storage for account details
- Add a graphical user interface (GUI)

## License

This project is open-source and available under the [MIT License](LICENSE).

---

**Happy Coding!**
