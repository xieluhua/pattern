package com.iamfy.design.principle.factory.method;

public class EnglishCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习英语");
    }
}
