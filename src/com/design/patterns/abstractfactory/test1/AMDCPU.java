package com.design.patterns.abstractfactory.test1;

/**
 * AMD的cpu实现
 * @author chenliangsen
 * @date 2019/12/12 11:30
 */
public class AMDCPU implements CPUApi{
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    /**
     * 构造方法，传入CPU的针脚数目
     * @param pins CUP的针脚数目
     */
    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in AMD CPU, pins = " + pins);
    }
}
