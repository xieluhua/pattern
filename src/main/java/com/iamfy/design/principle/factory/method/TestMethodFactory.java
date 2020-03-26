package com.iamfy.design.principle.factory.method;

public class TestMethodFactory {
    public static void main(String[] args) {
        ICourseFactory factory = new ChineseFactory();
        ICourse course = factory.crate();
        course.study();
    }
}
