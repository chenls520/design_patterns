package com.design.patterns.decorator.test1;

/**
 * @author chenliangsen
 * @date 2020/1/6 14:06
 */
public class Client {
    public static void main(String[] args) {
        Prize prize = new Prize();
        double zs = prize.calcPrize("张珊", null, null);
        System.out.println("zs " + zs);

        double ls = prize.calcPrize("李四", null, null);
        System.out.println("ls " + ls);

        double ww = prize.calcPrize("王五", null, null);
        System.out.println("ww " + ww);

    }
}
