package com.design.patterns.iterator.test1;

/**
 * @author chenliangsen
 * @date 2019/12/24 14:22
 */
public class Client {
    /**
     * 示意方法，使用迭代器的功能
     * 这里示意使用迭代器来迭代聚合对象
     */
    public void someOperation() {
        String[] names = {"张珊", "李四", "王五"};
        //创建聚合对象
        Aggregate aggregate = new ConcreteAggragate(names);
        //循环输出聚合对象中的值
        Iterator iterator = aggregate.createIterator();
        //首先设置迭代器到第一个元素
        iterator.first();
        while (!iterator.isDone()) {
            //取出当前的元素来
            Object o = iterator.currentItem();
            System.out.println("the obj == " + o);
            //如果还没有迭代到最后，那么就向下一个迭代
            iterator.next();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation();
    }
}
