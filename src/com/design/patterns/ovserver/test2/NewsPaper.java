package com.design.patterns.ovserver.test2;

/**
 * 报纸对象，具体的目标实现
 * @author chenliangsen
 * @date 2019/12/20 9:57
 */
public class NewsPaper extends Subject {
    /**
     * 报纸的具体内容
     */
    private String content;

    /**
     * 获取报纸的具体内容
     * @return 报纸的具体内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 示意，设置报纸的具体内容，相当于要出版了
     * @param content 报纸的具体内容
     */
    public void setContent(String content) {
        this.content = content;
        //内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers();
    }
}
