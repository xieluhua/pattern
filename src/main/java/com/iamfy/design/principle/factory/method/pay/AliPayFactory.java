package com.iamfy.design.principle.factory.method.pay;

public class AliPayFactory implements IPayFactory {
    @Override
    public IPay cratePay() {
       return new AliPay();
    }
}
