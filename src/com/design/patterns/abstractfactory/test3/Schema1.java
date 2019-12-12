package com.design.patterns.abstractfactory.test3;

import com.design.patterns.abstractfactory.test1.CPUApi;
import com.design.patterns.abstractfactory.test1.GAMainboard;
import com.design.patterns.abstractfactory.test1.IntelCPU;
import com.design.patterns.abstractfactory.test1.MainboardApi;

/**
 * 装机方案一：Intel的CPU + 技嘉的主板
 * 这里创建的CPU和主板对象的时候，是对应的，能匹配上的
 * @author chenliangsen
 * @date 2019/12/12 14:41
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
