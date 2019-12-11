package com.design.patterns.facade.test2;

/**
 * @author chenliangsen
 * @date 2019/12/10 19:43
 */
public class AModuleImpl implements AModuleApi {
    @Override
    public void testA() {
        System.out.println("现在在A模块里面操作testA方法");
    }
}
