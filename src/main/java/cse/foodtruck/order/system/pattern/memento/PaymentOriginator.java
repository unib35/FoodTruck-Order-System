package cse.foodtruck.order.system.pattern.memento;

import cse.foodtruck.order.system.dto.pay.CardPaymentInfoDto;


public class PaymentOriginator {
    private CardPaymentInfoDto cardPaymentInfoDto;

    public void setPaymentInfoDto(CardPaymentInfoDto dto){
        this.cardPaymentInfoDto = dto;
    }

    public PaymentMemento saveToMemento(){
        return new PaymentMemento(cardPaymentInfoDto);
    }

    public void restorePaymentInfo(PaymentMemento memento){
        this.cardPaymentInfoDto = memento.getPaymentInfoDto();
    }

}
