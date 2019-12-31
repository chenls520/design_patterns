package com.design.patterns.template_method.test1;

/**
 * 描述用户信息的数据模型
 * @author chenliangsen
 * @date 2019/12/26 9:29
 */
public class UserModel {
    private String uuid, userId, pwd, name;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
