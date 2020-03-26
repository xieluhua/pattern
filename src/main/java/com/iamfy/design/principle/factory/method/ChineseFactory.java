package com.iamfy.design.principle.factory.method;

/**
 * 课程简单工厂
 */
public class ChineseFactory implements ICourseFactory{
    @Override
    public ICourse crate() {
        return new ChineseCourse();
    }
}
