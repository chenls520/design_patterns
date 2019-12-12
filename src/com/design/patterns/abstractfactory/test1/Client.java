package com.design.patterns.abstractfactory.test1;

/**
 * @author chenliangsen
 * @date 2019/12/12 11:48
 */
public class Client {
    public static void main(String[] args) {
        //创建装机工程师
        ComputerEngineer computerEngineer = new ComputerEngineer();
        //告诉装机工程师自己选择的配件，让装机工程师组装电脑
        computerEngineer.makeComputer(1, 1);
    }
}
