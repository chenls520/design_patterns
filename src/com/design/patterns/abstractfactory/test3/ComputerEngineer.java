package com.design.patterns.abstractfactory.test3;

import com.design.patterns.abstractfactory.test1.CPUApi;
import com.design.patterns.abstractfactory.test1.MainboardApi;

/**
 * 装机工程师的类
 * @author chenliangsen
 * @date 2019/12/12 14:43
 */
public class ComputerEngineer {
    /**
     * 定义组装电脑需要的cpu
     */
    private CPUApi cpu = null;

    /**
     * 定义组装电脑所需要的主板
     */
    private MainboardApi mainboard = null;

    /**
     * 装机过程
     * @param schema 客户选择的装机方案
     */
    public void makeComputer(AbstractFactory schema) {
        //1.首先装备好装机需要的配件
        prepareHardwares(schema);
        //2.组装机器
        //3.测试机器
        //4.交付客户
    }

    /**
     * 装备装机所需要的配件
     * @param shema 客户选择的装机方案
     */
    private void prepareHardwares(AbstractFactory shema) {
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //直接找相应的工厂获取
        this.cpu = shema.createCPUApi();
        this.mainboard = shema.createMainboardApi();

        //测试一下配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();

    }
}
