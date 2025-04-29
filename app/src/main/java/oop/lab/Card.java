package oop.lab;

public class Card {
    public String cardNumber;
    public String cardHolder;

    public Card(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    public double getInterestRate() {
        return 0.0;
    }
}
