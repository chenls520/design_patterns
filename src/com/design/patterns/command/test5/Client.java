package com.design.patterns.command.test5;

/**
 * @author chenliangsen
 * @date 2019/12/24 10:46
 */
public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Command chop = new ChopCommand();
        Command duck = new DuckCommand();
        Command pork = new PorkCommand();

        waiter.orderDish(chop);
        waiter.orderDish(duck);
        waiter.orderDish(pork);

        waiter.orderOver();
    }
}
