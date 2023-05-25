package cse.foodtruck.order.system.pattern.bridge;

import cse.foodtruck.order.system.frame.pay.CashPaymentFrame;

public class CashPayment implements PaymentMethod{
    int totalPrice;
    public CashPayment(int totalPrice){
        this.totalPrice = totalPrice;
    }
    public void processPayment(){
        new CashPaymentFrame(totalPrice);
    }
}
