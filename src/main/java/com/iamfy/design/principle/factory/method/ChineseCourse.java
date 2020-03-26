package com.iamfy.design.principle.factory.method;

public class ChineseCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习语文");
    }
}
