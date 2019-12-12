package com.design.patterns.abstractfactory.test3;

/**
 * @author chenliangsen
 * @date 2019/12/12 14:47
 */
public class Client {
    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();
        //客户选择并创建需要使用的装机方案
        AbstractFactory schema = new Schema1();
        //告诉装机工程师自己选择的装机方案，让装机工程师组装电脑
        engineer.makeComputer(schema);
    }
}
