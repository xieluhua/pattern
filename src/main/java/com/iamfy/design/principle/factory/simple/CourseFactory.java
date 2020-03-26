package com.iamfy.design.principle.factory.simple;

/**
 * 课程简单工厂
 */
public class CourseFactory {
//    /**
//     * 根据传输name调用具体学习课程
//     * @param name
//     * @return
//     */
//    public ICourse addICourse(String name) {
//        if("语文".equals(name)) {
//            return new ChineseCourse();
//        } else if("英语".equals(name)) {
//            return new EnglishCourse();
//        }
//        return null;
//    }

//    public ICourse addICourse(String className) {
//        try {
//            if (StringUtils.isNotEmpty(className)) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }


    public ICourse addICourse(Class<? extends ICourse> classz) {
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
