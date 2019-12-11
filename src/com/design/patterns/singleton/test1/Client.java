package com.design.patterns.singleton.test1;

/**
 * @author chenliangsen
 * @date 2019/12/11 10:20
 */
public class Client {
    public static void main(String[] args) {
        //创建读取应用配置的对象
        AppConfig appConfig = new AppConfig();
        String parameterA = appConfig.getParameterA();
        String parameterB = appConfig.getParameterB();
        System.out.println("a = " + parameterA + "   b = " + parameterB);
    }
}
