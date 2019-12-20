package com.design.patterns.ovserver.test2;

/**
 * @author chenliangsen
 * @date 2019/12/20 10:01
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
        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        subject.setContent("本期内容是观察者模式");
    }
}
