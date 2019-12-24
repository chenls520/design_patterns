package com.design.patterns.command.test5;

/**
 * 厨师对象，做凉菜
 * @author chenliangsen
 * @date 2019/12/24 10:33
 */
public class CoolCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("凉菜：" + name + " 已经做好，本厨师正在装盘.");
    }
}
