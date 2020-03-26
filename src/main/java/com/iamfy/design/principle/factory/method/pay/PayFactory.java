package com.iamfy.design.principle.factory.method.pay;

public class PayFactory {

    public IPay pay(Class<? extends IPay> classz) {
        try {
            if (null != classz) {
                return classz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
