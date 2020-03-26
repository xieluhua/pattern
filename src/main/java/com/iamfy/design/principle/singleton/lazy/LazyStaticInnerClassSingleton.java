package com.iamfy.design.principle.singleton.lazy;

/**
 * classPath : LazyStaticInnerClassSingleton.class
 * LazyStaticInnerClassSingleton$LazyHolder.class
 * 优点：代码优雅，利用Java本身语法特点，性能高，避免了内存浪费
 * 缺点：能够被反射破坏
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton() {
        // 判断是否存在对象，存在抛出异常 避免被反射破坏  缺点不优雅
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

    private static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
