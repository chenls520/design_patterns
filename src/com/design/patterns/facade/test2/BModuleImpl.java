package com.design.patterns.facade.test2;

/**
 * @author chenliangsen
 * @date 2019/12/10 19:43
 */
public class BModuleImpl implements BModuleApi {
    @Override
    public void testB() {
        System.out.println("现在在B模块里面操作testB方法");
    }
}
