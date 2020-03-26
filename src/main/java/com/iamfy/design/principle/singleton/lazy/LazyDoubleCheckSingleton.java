package com.iamfy.design.principle.singleton.lazy;

/**
 * 优点：节省了内存，使用synchronized代码块保证线程安全
 * 缺点：代码不优雅 可读性不高
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {

    }
    public static LazyDoubleCheckSingleton getInstance() {
        // 检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                // 检查是否要创建实例
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    // 指令重排序问题
                }
            }
        }
        return instance;
    }
}
