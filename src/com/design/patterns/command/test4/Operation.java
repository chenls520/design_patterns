package com.design.patterns.command.test4;

/**
 * 运算类，真正实现加减法运算
 * @author chenliangsen
 * @date 2019/12/24 9:38
 */
public class Operation implements OperationApi {
    /**
     * 记录运算的结果
     */
    public int result;


    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int num) {
        //实现加法功能
        result += num;
    }

    @Override
    public void substract(int num) {
        //实现减法功能
        result -= num;
    }
}
