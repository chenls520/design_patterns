package com.design.patterns.adapter.test2;

/**
 * 适配器
 * @author chenliangsen
 * @date 2019/12/11 9:46
 */
public class Adapter implements Target{
    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //可能转调已经实现的方法，进行适配
        adaptee.specificRequest();

    }
}
