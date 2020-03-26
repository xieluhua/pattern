package com.iamfy.design.principle.factory.method.pay;

public class TestPay {
    public static void main(String[] args) {
//        IPay pay = new PayFactory().pay(AliPay.class);
//        pay.pay();
        PayFactory  payFactory = new PayFactory();
        IPay pay = payFactory.pay(AliPay.class);
        pay.pay();
    }
}
