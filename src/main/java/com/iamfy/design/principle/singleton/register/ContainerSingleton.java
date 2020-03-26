package com.iamfy.design.principle.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 */
public class ContainerSingleton {
    public ContainerSingleton() {
    }

    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        Object instance = null;
        if (map.containsKey(className)) {
            return map.get(className);
        } else {
            try {
                instance = Class.forName(className).newInstance();
                map.put(className, instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        }
    }
}
