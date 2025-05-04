package oop.lab;

public class BusinessAccount extends BankAccount implements LoanService {

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
}
