package cse.foodtruck.order.system.pattern.memento;

import cse.foodtruck.order.system.dto.pay.PaymentInfoDto;
import cse.foodtruck.order.system.pattern.bridge.PaymentMethod;

public class PaymentMemento {
    private final PaymentInfoDto paymentInfoDto;

    public PaymentMemento(PaymentInfoDto dto) {
        this.paymentInfoDto = dto;
    }

    public PaymentInfoDto getPaymentInfoDto() {
        return this.paymentInfoDto;
    }
}
