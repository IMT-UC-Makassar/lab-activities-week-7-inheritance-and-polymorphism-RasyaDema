package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01;
    }

    @Override
    public void transferFunds(double amount, String toAccount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Transferred " + amount + " to account " + toAccount);
        }
    }

    @Override
    public void payBills(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Paid bill of " + amount);
        }
    }
}
