package cse.foodtruck.order.system.pattern.memento;

import cse.foodtruck.order.system.dto.pay.CardPaymentInfoDto;

public class PaymentMemento {
    private final CardPaymentInfoDto cardPaymentInfoDto;

    public PaymentMemento(CardPaymentInfoDto dto) {
        this.cardPaymentInfoDto = dto;
    }

    public CardPaymentInfoDto getPaymentInfoDto() {
        return this.cardPaymentInfoDto;
    }
}
