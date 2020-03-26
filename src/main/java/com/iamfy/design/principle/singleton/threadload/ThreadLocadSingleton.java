package com.iamfy.design.principle.singleton.threadload;

public class ThreadLocadSingleton {
    private static final ThreadLocal<ThreadLocadSingleton> threadLocalInstance = new ThreadLocal<ThreadLocadSingleton>(){
        @Override
        protected ThreadLocadSingleton initialValue() {
            return new ThreadLocadSingleton();
        }
    };
    private ThreadLocadSingleton() {
    }
    public static ThreadLocadSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
