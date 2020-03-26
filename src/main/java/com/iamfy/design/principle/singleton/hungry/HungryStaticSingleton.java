package com.iamfy.design.principle.singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungryStaticSingleton {
    // 类加载
    // 先静态后动态 先上，后下 先属性后方法
    private static final HungryStaticSingleton singleton;

    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getSingleton() {
        return singleton;
    }
}
