package com.design.patterns.command.test5;

/**
 * 厨师对象，做热菜
 * @author chenliangsen
 * @date 2019/12/24 10:33
 */
public class HotCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("本厨师正在做：" + name);
    }
}
