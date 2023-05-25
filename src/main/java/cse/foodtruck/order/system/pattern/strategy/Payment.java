package cse.foodtruck.order.system.pattern.strategy;

import cse.foodtruck.order.system.dto.pay.PaymentInfoDto;

public interface Payment {
    public abstract void pay(PaymentInfoDto dto);
}
