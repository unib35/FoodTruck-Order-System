package cse.foodtruck.order.system.pattern.strategy;

import cse.foodtruck.order.system.dto.pay.PaymentInfoDto;

public class PayService {
    private CardPayment cardPayment;
    private CashPayment cashPayment;

    public void payment(Payment payment, PaymentInfoDto paymentInfoDto) {
        payment.pay(paymentInfoDto);
    }
}
