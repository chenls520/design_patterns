package com.design.patterns.mediator.test3;

/**
 * 人员类
 * @author chenliangsen
 * @date 2019/12/18 11:13
 */
public class User {

    /**
     * 人员编号
     */
    private String userId;

    /**
     * 人员名称
     */
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 人员离职
     * @return 是否处理成功
     */
    public boolean dimisson() {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteUser(userId);
        return true;
    }
}
