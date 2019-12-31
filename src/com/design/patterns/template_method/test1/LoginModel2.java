package com.design.patterns.template_method.test1;

/**
 * 描述登录人员登录时填写的信息的数据模型
 * @author chenliangsen
 * @date 2019/12/26 9:28
 */
public class LoginModel2 {
    private String workerId, pwd;

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
