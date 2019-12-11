package com.design.patterns.simple_factory.test1;

/**
 * 接口的具体实现对象B
 * @author chenliangsen
 * @date 2019/12/10 19:00
 */
public class ImplB implements Api {
    /**
     * 实现功能的代码，示意一下
     * @param s 示意，需要的参数
     */
    @Override
    public void operation(String s) {
        System.out.println("ImplB s==" + s);
    }
}
