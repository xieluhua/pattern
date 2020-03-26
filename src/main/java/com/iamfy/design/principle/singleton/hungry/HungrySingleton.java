package com.iamfy.design.principle.singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungrySingleton {
    private  static  final  HungrySingleton  singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
