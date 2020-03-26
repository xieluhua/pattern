package com.iamfy.design.principle.factory.method.pay;

public class TestPay {
    public static void main(String[] args) {
//        IPay pay = new PayFactory().pay(AliPay.class);
//        pay.pay();
        IPayFactory payFactory = new AliPayFactory();
        IPay pay = payFactory.cratePay();
        pay.pay();
    }
}
