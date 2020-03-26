package com.iamfy.design.principle.factory.simple.pay;

public class WechatPay implements IPay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
