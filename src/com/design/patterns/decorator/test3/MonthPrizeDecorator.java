package com.design.patterns.decorator.test3;

import com.design.patterns.decorator.test1.TempDB;

import java.util.Date;

/**
 * 装饰器对象，计算当月业务奖金
 * @author chenliangsen
 * @date 2020/1/6 14:28
 */
public class MonthPrizeDecorator extends Decorator {
    /**
     * 通过构造方法传入被装饰的对象
     *
     * @param c 被装饰的对象
     */
    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //1.先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //2.然后计算当月业务奖金，按人员和时间去获取当月业务额，然后再乘以3%
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "当月业务奖金" + prize);
        return money + prize;
    }
}
