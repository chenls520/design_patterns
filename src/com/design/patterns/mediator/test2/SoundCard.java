package com.design.patterns.mediator.test2;

/**
 * 声卡类，一个同事类
 * @author chenliangsen
 * @date 2019/12/18 10:16
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据发出声音
     * @param data 发出声音的数据
     */
    public void showData(String data) {
        System.out.println("画外音：" + data);
    }
}
