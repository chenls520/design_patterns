package com.design.patterns.chain_of_responsibility.test5;

/**
 * 通用的请求对象
 * @author chenliangsen
 * @date 2020/1/7 10:29
 */
public class RequestModel {
    /**
     * 表示具体的业务类型
     */
    private String type;


    /**
     * 通过构造方法把具体的业务类型传递进来
     * @param type
     */
    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
