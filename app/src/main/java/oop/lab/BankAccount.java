package oop.lab;

@SuppressWarnings("unused")
public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {

            } else {
                throw new IllegalArgumentException("Insufficient funds");
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}
