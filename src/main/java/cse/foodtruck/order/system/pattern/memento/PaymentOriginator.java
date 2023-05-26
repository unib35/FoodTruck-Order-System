package cse.foodtruck.order.system.pattern.memento;

import cse.foodtruck.order.system.dto.pay.PaymentInfoDto;
import lombok.Getter;
import lombok.Setter;


public class PaymentOriginator {
    private PaymentInfoDto paymentInfoDto;

    public void setPaymentInfoDto(PaymentInfoDto dto){
        this.paymentInfoDto = dto;
    }

    public PaymentMemento saveToMemento(){
        return new PaymentMemento(paymentInfoDto);
    }

    public void restorePaymentInfo(PaymentMemento memento){
        this.paymentInfoDto = memento.getPaymentInfoDto();
    }

}
