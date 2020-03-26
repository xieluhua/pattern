package com.iamfy.design.principle.prototype.shallow;


import java.io.*;

public class UserInfoProtoType implements Cloneable {
    private int age;
    private String name;

    @Override
    public UserInfoProtoType clone() {
        try {
            return (UserInfoProtoType) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 深克隆
     * @return
     */
    public UserInfoProtoType deepclone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (UserInfoProtoType) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfoProtoType{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
