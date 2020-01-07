package com.design.patterns.chain_of_responsibility.test1;

/**
 * @author chenliangsen
 * @date 2020/1/7 9:53
 */
public class Client {
    public static void main(String[] args) {
        FeeRequest re = new FeeRequest();

        String ret1 = re.requestToProjectManager("小李", 300);
        System.out.println("ret1=" + ret1);

        String ret2 = re.requestToProjectManager("小张", 300);
        System.out.println("ret2=" + ret2);

        String ret3 = re.requestToProjectManager("小李", 600);
        System.out.println("ret3=" + ret3);

        String ret4 = re.requestToProjectManager("小张", 600);
        System.out.println("ret4=" + ret4);

        String ret5 = re.requestToProjectManager("小李", 1200);
        System.out.println("ret5=" + ret5);

        String ret6 = re.requestToProjectManager("小张", 1200);
        System.out.println("ret6=" + ret6);
    }
}
