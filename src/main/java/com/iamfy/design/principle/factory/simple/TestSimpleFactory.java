package com.iamfy.design.principle.factory.simple;

public class TestSimpleFactory {
    public static void main(String[] args) {
        // 通过名字
//        ICourse course = new CourseFactory().addICourse("语文");
//        if(null != course) {
//            course.study();
//        }
        // 通过类名称
//        ICourse course = new CourseFactory().addICourse("com.iamfy.design.principle.factory.simple.ChineseCourse1");
//        if(null != course) {
//            course.study();
//        }
        ICourse course = new CourseFactory().addICourse(ChineseCourse.class);
        if(null != course) {
            course.study();
        }

    }
}
