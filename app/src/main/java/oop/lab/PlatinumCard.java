package oop.lab;

public class PlatinumCard extends CreditCard {

    public PlatinumCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        return 0.12; // 12% annual interest rate for platinum
    }
}
