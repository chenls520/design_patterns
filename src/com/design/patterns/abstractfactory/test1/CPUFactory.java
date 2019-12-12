package com.design.patterns.abstractfactory.test1;

/**
 * 创建CPU的简单工厂
 * @author chenliangsen
 * @date 2019/12/12 11:36
 */
public class CPUFactory {

    /**
     * 创建CPU的接口对象的方法
     * @param type 选择CPU类型的参数
     * @return CPU接口对象的方法
     */
    public static CPUApi creatCPUApi(int type) {
        CPUApi cpu = null;
        if (type == 1) {
            cpu = new IntelCPU(1156);
        }else if (type ==2) {
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
