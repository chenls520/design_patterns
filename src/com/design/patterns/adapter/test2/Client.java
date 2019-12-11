package com.design.patterns.adapter.test2;

/**
 * 使用适配器的客户端
 * @author chenliangsen
 * @date 2019/12/11 9:48
 */
public class Client {
    public static void main(String[] args) {
        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        //请求处理
        target.request();
    }
}

/**
 * tips:
 * Client： 客户端，调用自己需要的领域接口Target
 * Target：定义客户端需要的跟特定领域相关的接口
 * Adaptee： 已经存在的接口，通常能满足客户端的功能要求，但是接口与客户端
 * 要求的特定领域接口不一致，需要被适配
 * Adapter：适配器，把Adaptee适配成为Client需要的Target
 *
 *
 *
 */
