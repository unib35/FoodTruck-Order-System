package cse.foodtruck.order.system.pattern.strategy;

import lombok.NoArgsConstructor;

import javax.swing.*;

@NoArgsConstructor
public class CashStrategy implements PaymentStrategy{

    private String accountBank;
    private String accountNumber;
    private String accountPw;
    public CashStrategy(String accountBank, String accountNumber, String accountPw) {
        this.accountBank = accountBank;
        this.accountNumber = accountNumber;
        this.accountPw = accountPw;
    }
    @Override
    public void pay(int amount) {
        System.out.println("현금 결제");
        JOptionPane.showMessageDialog(null, "현금 결제");
    }
}
