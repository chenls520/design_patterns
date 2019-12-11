package com.design.patterns.simple_factory.test1;

/**
 * 客户端，使用Api接口
 * @author chenliangsen
 * @date 2019/12/10 19:07
 */
public class Client {
    public static void main(String[] args) {
//        通过简单工厂来获取接口对象
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");

        api = PropertiesFactory.createApi();
        api.operation("使用配置文件创建对象");
    }
}
