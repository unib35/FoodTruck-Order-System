package cse.foodtruck.order.system.pattern.strategy;

import lombok.NoArgsConstructor;

import javax.swing.*;
@NoArgsConstructor

public class CardStrategy implements PaymentStrategy{
    private String cardNumber;
    private String cardType;
    private String cvv;
    private String expirationDate;



    public CardStrategy(String cardNumber, String cardType, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " with card");
        JOptionPane.showMessageDialog(null, "Paid " + amount + " with card");
    }
}
