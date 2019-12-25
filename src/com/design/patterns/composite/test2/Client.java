package com.design.patterns.composite.test2;


/**
 * @author chenliangsen
 * @date 2019/12/25 9:33
 */
public class Client {
    public static void main(String[] args) {
        Component root = new Composite();
        Component c1 = new Composite();
        Component c2 = new Composite();

        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();
        Component leaf4 = new Leaf();

        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        Component o = root.getChild(1);
        System.out.println(o);
    }
}
