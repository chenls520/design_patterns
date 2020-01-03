package com.design.patterns.flyweight.test2;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author chenliangsen
 * @date 2020/1/3 10:13
 */
public class FlyweightFactory {
    /**
     * 缓存多个Flyweight对象，这里只是示意一下
     */
    private Map<String, Flyweight> fsMap =
            new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        //这个方法中基本的实现步骤如下：
        //先从缓存中查找，是否存在key对应的Flyweight对象
        Flyweight f = fsMap.get(key);
        //如果存在，就返回相应的Flyweight对象
        if (f == null) {
            //如果不存在
            //创建一个新的Flyweight对象
            f = new ConcreteFlyweight(key);
            //把这个新的Flyweight对象添加到缓存中
            fsMap.put(key, f);
            //然后返回这个新的Flyweight对象
        }
        return f;
    }
}
