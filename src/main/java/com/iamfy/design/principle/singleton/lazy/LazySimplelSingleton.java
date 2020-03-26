package com.iamfy.design.principle.singleton.lazy;

/**
 * 优点：节省了内存，使用synchronized方法保证线程安全
 * 缺点：性能低
 */
public class LazySimplelSingleton {
    private static LazySimplelSingleton instance;
    private LazySimplelSingleton(){

    }

    public synchronized static LazySimplelSingleton getInstance() {
        if(instance == null) {
            instance = new LazySimplelSingleton();
        }
        return instance;
    }
}
