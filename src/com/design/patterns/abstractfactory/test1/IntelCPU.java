package com.design.patterns.abstractfactory.test1;

/**
 * Intel的CPU实现
 * @author chenliangsen
 * @date 2019/12/12 11:28
 */
public class IntelCPU implements CPUApi{
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    /**
     * 构造方法， 传入CPU的针脚数
     * @param pins CPU的针脚数
     */
    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in Intel CPU, pins = " + pins);
    }
}
