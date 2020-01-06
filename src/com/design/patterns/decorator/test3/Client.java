package com.design.patterns.decorator.test3;

/**
 * @author chenliangsen
 * @date 2020/1/6 14:37
 */
public class Client {
    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();

        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(d1);

        double zs = d2.calcPrize("张珊", null, null);
        System.out.println("zs = " + zs);

        double ls = d2.calcPrize("李四", null, null);
        System.out.println("ls = " + ls);

        Decorator d3 = new GroupPrizeDecorator(d2);
        double ww = d3.calcPrize("王五", null, null);
        System.out.println("ww " + ww);
    }
}
