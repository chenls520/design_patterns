package com.design.patterns.ovserver.test3;

/**
 * @author chenliangsen
 * @date 2019/12/20 11:44
 */
public class Client {
    public static void main(String[] args) {
        //创建一个报纸作为被观察者
        NewsPaper subject = new NewsPaper();
        //创建读者，也就是观察者
        Reader reader1 = new Reader();
        reader1.setName("张珊1");
        Reader reader2 = new Reader();
        reader2.setName("张珊2");
        Reader reader3 = new Reader();
        reader3.setName("张珊3");
        //注册订阅者
        subject.addObserver(reader1);
        subject.addObserver(reader2);
        subject.addObserver(reader3);

        subject.setContent("本期内容是观察者模式test3");
    }
}
