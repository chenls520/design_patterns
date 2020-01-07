package com.design.patterns.chain_of_responsibility.test4;


/**
 * @author chenliangsen
 * @date 2020/1/7 10:13
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        String ret1 = h3.handleFeeRequest("小李", 300);
        System.out.println("ret1=" + ret1);

        String ret2 = h3.handleFeeRequest("小张", 300);
        System.out.println("ret2=" + ret2);

        String ret3 = h3.handleFeeRequest("小李", 600);
        System.out.println("ret3=" + ret3);

        String ret4 = h3.handleFeeRequest("小张", 600);
        System.out.println("ret4=" + ret4);

        String ret5 = h3.handleFeeRequest("小李", 1200);
        System.out.println("ret5=" + ret5);

        String ret6 = h3.handleFeeRequest("小张", 1200);
        System.out.println("ret6=" + ret6);

        h3.handlePreFeeQuest("小张", 3000);
        h3.handlePreFeeQuest("小张", 6000);
        h3.handlePreFeeQuest("小张", 12000);
    }
}
