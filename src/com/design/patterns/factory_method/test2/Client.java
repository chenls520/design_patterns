package com.design.patterns.factory_method.test2;

/**
 * @author chenliangsen
 * @date 2019/12/12 10:27
 */
public class Client {
    public static void main(String[] args) {
        //创建需要使用的Creator对象
        ExportOperate operate = new ExportDBOperate();
        //调用输出数据的功能方法
        operate.export("测试数据");
    }
}
