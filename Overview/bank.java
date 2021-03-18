package Overview;

import java.lang.*;

// bank.java
// demonstrates basic OOP syntax
// to run this program type: java BankApp

class BankAccount {
    private double balance; // account balance

    public BankAccount(double openingBalance) // constructor
    {
        balance = openingBalance;
    }

    public void deposit(double amount) // makes deposit
    {
        balance = balance + amount;
    }

    public void withdraw(double amount) // makes withdrawal
    {
        balance = balance - amount;
    }

    public void display() // displays balance
    {
        System.out.println("Balance: " + balance);
    }

} // end class BankAccount

class BankApp {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000.0); // create account

        System.out.print("Before Transaction, ");
        ba1.display(); // display balance

        ba1.deposit(345.0); // make deposit

        System.out.print("After Transaction 1, ");
        ba1.display();

        ba1.withdraw(200.0); // make withdrawal

        System.out.print("After Transaction 2, ");
        ba1.display();
    }
}