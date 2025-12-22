package com.acharya;
import java.util.Scanner;
class BankAccount1 {
    // fields
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    // constructor
    public BankAccount1(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    // method to get balance
    public double getBalance() {
        return accountBalance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited ₹" + amount + " into " + bankName + " account.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from " + bankName + " account.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class BankAccount {

	public static void main(String[] args) {
		// creating three bank accounts
        BankAccount1 acc1 = new BankAccount1("Rohan", "ICICI", 10000);
        BankAccount1 acc2 = new BankAccount1("Rahul", "HDFC", 20000);
        BankAccount1 acc3 = new BankAccount1("Adhil", "SBI", 30000);

        // transactions for ICICI account
        acc1.deposit(2000);
        acc1.withdraw(1500);
        System.out.println("ICICI Balance: ₹" + acc1.getBalance());
        System.out.println();

        // transactions for HDFC account
        acc2.deposit(3000);
        acc2.withdraw(5000);
        System.out.println("HDFC Balance: ₹" + acc2.getBalance());
        System.out.println();

        // transactions for SBI account
        acc3.deposit(5000);
        acc3.withdraw(4000);
        System.out.println("SBI Balance: ₹" + acc3.getBalance());

	}

}

