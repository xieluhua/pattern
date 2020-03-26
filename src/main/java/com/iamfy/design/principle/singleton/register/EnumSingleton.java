package com.iamfy.design.principle.singleton.register;

/**
 * 有构造方法但是没有无参构造方法
 *
 */
public enum EnumSingleton {
    INSTANCE;
    private  Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance( Object data) {
       return  INSTANCE;
    }
}
