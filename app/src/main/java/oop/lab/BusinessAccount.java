package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance += balance *0.05;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount > 0) {
            System.out.println("Loan Applied: $ "+ amount);
        }
    }

    @Override
    public String checkLoanStatus() {
        return "Pending";
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
