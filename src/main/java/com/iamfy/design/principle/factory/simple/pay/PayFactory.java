package com.iamfy.design.principle.factory.simple.pay;

public class PayFactory {

    public IPay cratePay(Class<? extends IPay> classz) {
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
