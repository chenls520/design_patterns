package com.design.patterns.iterator.test1;

/**
 * 具体的迭代器实现对象，示意的是聚合对象为数组的迭代器
 * 不同的聚合对象相应的迭代器实现是不一样的
 * @author chenliangsen
 * @date 2019/12/24 14:10
 */
public class ConcreteIterator implements Iterator {

    /**
     * 持有被迭代的具体的聚合对象
     */
    private ConcreteAggragate aggragate;
    /**
     * 内部索引，记录当前迭代到的索引位置
     * -1表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = -1;

    /**
     * 构造方法，传入被迭代的具体的聚合对象
     * @param aggragate 被迭代的具体的聚合对象
     */
    public ConcreteIterator(ConcreteAggragate aggragate) {
        this.aggragate = aggragate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggragate.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index == this.aggragate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggragate.get(index);
    }
}
