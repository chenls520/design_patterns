package com.design.patterns.ovserver.test3;

import java.util.Observable;
import java.util.Observer;

/**
 * 真正的读者，为了简单就描述一下姓名
 * @author chenliangsen
 * @date 2019/12/20 11:41
 */
public class Reader implements Observer {
    /**
     * 读者的姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        //推的方式接受
        System.out.println(name + " 收到报纸了，目标推过来的内容是===" + arg);
        //拉的方式接收
        System.out.println(name + " 收到报纸了，主动到目标对象去拉的内容是===="
                + ((NewsPaper)o).getContent());
    }
}
