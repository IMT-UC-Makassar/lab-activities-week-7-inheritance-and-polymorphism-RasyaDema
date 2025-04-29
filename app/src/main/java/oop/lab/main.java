package oop.lab;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("001", "Alice", 1000);
        CheckingAccount checking = new CheckingAccount("002", "Bob", 500);
        BusinessAccount business = new BusinessAccount("003", "Charlie", 2000);

        DebitCard debit = new DebitCard("D001", "Alice");
        CreditCard credit = new CreditCard("C001", "Bob");
        PlatinumCard platinum = new PlatinumCard("P001", "Charlie");

        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Checking Interest: " + checking.calculateInterest());
        System.out.println("Business Interest: " + business.calculateInterest());

        business.applyForLoan(5000);
        System.out.println("Business Loan Status: " + business.checkLoanStatus());

        System.out.println("Debit Card Interest Rate: " + debit.getInterestRate());
        System.out.println("Credit Card Interest Rate: " + credit.getInterestRate());
        System.out.println("Platinum Card Interest Rate: " + platinum.getInterestRate());
    }
}
