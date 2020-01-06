package com.design.patterns.decorator.test3;

import com.design.patterns.decorator.test1.TempDB;

import java.util.Date;

/**
 * 装饰器对象，计算当月团队业务奖金
 * @author chenliangsen
 * @date 2020/1/6 14:28
 */
public class GroupPrizeDecorator extends Decorator {
    /**
     * 通过构造方法传入被装饰的对象
     *
     * @param c 被装饰的对象
     */
    public GroupPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //1.先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //2.然后计算当月团队业务奖金，先计算出团队总的业务额，然后再乘以1%
        //假设都是一个团队的
        double group = 0.0;
        for (Double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金" + prize);
        return money + prize;
    }
}
