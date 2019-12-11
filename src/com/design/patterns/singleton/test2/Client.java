package com.design.patterns.singleton.test2;

/**
 * @author chenliangsen
 * @date 2019/12/11 10:34
 */
public class Client {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        String parameterA = config.getParameterA();
        String parameterB = config.getParameterB();
        System.out.println("a = " + parameterA + "   b = " + parameterB);
    }
}
