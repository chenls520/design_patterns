package com.design.patterns.abstractfactory.test3;

import com.design.patterns.abstractfactory.test1.CPUApi;
import com.design.patterns.abstractfactory.test1.MainboardApi;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 * @author chenliangsen
 * @date 2019/12/12 14:39
 */
public interface AbstractFactory {

    /**
     * 创建CPU的对象
     * @return CPU对象
     */
    public CPUApi createCPUApi();

    /**
     * 创建主板的对象
     * @return 主板的对象
     */
    public MainboardApi createMainboardApi();
}
