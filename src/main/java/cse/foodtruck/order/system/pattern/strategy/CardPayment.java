package cse.foodtruck.order.system.pattern.strategy;

import cse.foodtruck.order.system.dto.pay.PaymentInfoDto;
import lombok.NoArgsConstructor;

import javax.swing.*;
@NoArgsConstructor

public class CardPayment implements Payment{

    @Override
    public void pay(PaymentInfoDto dto) {

    }
}
