package com.iamfy.design.principle.prototype.shallow;

public class TestShallow {
    public static void main(String[] args) {
        UserInfoProtoType info = new UserInfoProtoType();
        info.setAge(11);
        info.setName("谢露华");
        System.out.println(info);
        UserInfoProtoType cloneinfo = info.clone();
        System.out.println("克隆对象" + cloneinfo);

    }
}
