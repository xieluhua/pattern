package com.iamfy.design.principle.factory.simple.pay;

public class TestPay {
    public static void main(String[] args) {
        IPay pay = new PayFactory().cratePay(AliPay.class);
        pay.pay();
    }
}
