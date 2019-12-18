package com.design.patterns.mediator.test2;

/**
 * @author chenliangsen
 * @date 2019/12/18 10:53
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者---主板对象
        MotherBoard motherBoard = new MotherBoard();
        //创建同事类
        CDDriver cdDriver = new CDDriver(motherBoard);
        CPU cpu = new CPU(motherBoard);
        VideoCard videoCard = new VideoCard(motherBoard);
        SoundCard soundCard = new SoundCard(motherBoard);

        //3 让中介者知道所有的同事
        motherBoard.setCdDriver(cdDriver);
        motherBoard.setCpu(cpu);
        motherBoard.setVideoCard(videoCard);
        motherBoard.setSoundCard(soundCard);

        //4.开始看电影，把光盘放入光驱，光驱开始读盘
        cdDriver.readCD();
    }
}
