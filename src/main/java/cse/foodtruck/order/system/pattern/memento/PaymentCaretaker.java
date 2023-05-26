package cse.foodtruck.order.system.pattern.memento;

public class PaymentCaretaker {
    private PaymentMemento paymentMemento;

    public void save(PaymentOriginator originator){
        this.paymentMemento = originator.saveToMemento();
    }

    public void undo(PaymentOriginator originator){
        originator.restorePaymentInfo(paymentMemento);
    }
}


