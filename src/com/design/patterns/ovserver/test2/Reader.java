package com.design.patterns.ovserver.test2;

/**
 * 真正的读者，为了简单就描述一下姓名
 * @author chenliangsen
 * @date 2019/12/20 9:59
 */
public class Reader implements Observer{
    /**
     * 读者的姓名
     */
    private String name;
    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，阅读它，内容是==="
                + ((NewsPaper)subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
