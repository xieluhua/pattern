package com.iamfy.design.principle.factory.simple.pay;

public class AliPay implements IPay{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
