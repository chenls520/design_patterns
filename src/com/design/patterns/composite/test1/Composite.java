package com.design.patterns.composite.test1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 组合对象，可以包含其他组合对象或者叶子对象
 * @author chenliangsen
 * @date 2019/12/25 9:26
 */
public class Composite {
    /**
     * 用来记录包含的其他组合对象
     */
    private Collection<Composite> childComposite = new ArrayList<Composite>();

    /**
     * 用来记录包含的其他叶子对象
     */
    private Collection<Leaf> childLeaf = new ArrayList<Leaf>();

    /**
     * 组合对象的名字
     */
    private String name = "";

    /**
     * 构造方法，传入组合对象的名字
     * @param name 组合对象的名字
     */
    public Composite(String name) {
        this.name = name;
    }

    /**
     * 向组合对象加入被它包含的其他组合对象
     * @param composite 被它包含的其他组合对象
     */
    public void addComposite(Composite composite) {
        this.childComposite.add(composite);
    }

    /**
     * 向组合对象加入被它包含的叶子对象
     * @param leaf 被它包含的叶子对象
     */
    public void addLeaf(Leaf leaf) {
        this.childLeaf.add(leaf);
    }

    public void printStruct(String preStr) {
        //先输出自己，前序遍历？
        System.out.println(preStr + " - " + this.name);
        //然后添加一个空格，表示向后缩进一个空格，输出自己包含的叶子对象
        preStr += " ";
        for (Leaf leaf : childLeaf) {
            leaf.printStruct(preStr);
        }
        //输出当前对象的子对象
        for (Composite composite : childComposite) {
            //递归输出每个子对象
            composite.printStruct(preStr);
        }
    }
}
