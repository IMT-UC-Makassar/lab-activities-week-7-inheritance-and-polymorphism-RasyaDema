package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }

    @Override
    public void transferFunds(double amount, String toAccountNumber) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Transferred $" + amount + " to " + toAccountNumber);
        }
    }

    @Override
    public void payBills(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Paid bill of $" + amount);
        }
    }
}

