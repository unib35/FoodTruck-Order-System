package cse.foodtruck.order.system.pattern.bridge;

import cse.foodtruck.order.system.frame.pay.CardPaymentFrame;

public class CardPayment implements PaymentMethod{
    int totalPrice;
    public CardPayment(int totalPrice){
        this.totalPrice = totalPrice;
    }
    public void processPayment(){
        new CardPaymentFrame(totalPrice);
    }
}
