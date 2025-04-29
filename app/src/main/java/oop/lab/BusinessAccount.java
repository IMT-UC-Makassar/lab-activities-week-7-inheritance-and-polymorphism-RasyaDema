package oop.lab;

public class BusinessAccount extends BankAccount implements LoanService {
    private String loanStatus = "No Loan";

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount > 0) {
            loanStatus = "Loan Applied: $" + amount;
        }
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}
