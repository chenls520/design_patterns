package com.design.patterns.mediator.test2;

/**
 * 光驱类，一个同事类
 * @author chenliangsen
 * @date 2019/12/18 10:10
 */
public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 光驱读取出来的数据
     */
    private String data = "";

    /**
     * 获取光驱读取出来的数据
     * @return 光驱读取出来的数据
     */
    public String getData() {
        return data;
    }

    /**
     * 读取光盘
     */
    public void readCD() {
        this.data = "设计模式,值得好好研究";
        //通知主板，自己的状态发生了改变
        this.getMediator().changed(this);
    }
}
