package com.design.patterns.singleton.test1;

/**
 * 枚举方式实现单例模式，简洁高效安全
 * 枚举自动提供了序列化机制
 * @author chenliangsen
 * @date 2019/12/11 10:50
 */
public enum  Singleton3 {
    /**
     * 定义一个枚举的元素，它就代表了Singleton3的一个实例
     */
    uniqueInstance;

    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOperation() {
        //功能处理
    }
}
