package com.design.patterns.prototype.test2;

/**
 * 使用原型的客户端
 * @author chenliangsen
 * @date 2019/12/17 15:18
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    /**
     * 构造对象，传入需要使用的原型接口对象
     * @param prototype 需要使用的原型接口对象
     */
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    /**
     * 示意方法，执行某个功能操作
     */
    public void operation() {
        Prototype clone = prototype.clone();
    }
}
