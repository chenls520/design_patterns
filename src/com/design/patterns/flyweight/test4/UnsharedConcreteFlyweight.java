package com.design.patterns.flyweight.test4;


import java.util.ArrayList;
import java.util.List;

/**
 * 不需要共享的享元对象的实现，也是组合模式中的组合对象
 * @author chenliangsen
 * @date 2020/1/3 15:12
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    /**
     * 记录每个组合对象所包含的子组件
     */
    private List<Flyweight> list = new ArrayList<Flyweight>();

    public void add(Flyweight flyweight) {
        list.add(flyweight);
    }
    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight flyweight : list) {
            //递归调用
            if (flyweight.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }
}
