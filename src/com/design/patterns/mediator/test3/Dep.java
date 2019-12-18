package com.design.patterns.mediator.test3;

/**
 * 部门类
 * @author chenliangsen
 * @date 2019/12/18 11:11
 */
public class Dep {

    /**
     * 描述部门编号
     */
    private String depId;

    /**
     * 描述部门名称
     */
    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public boolean deleteDep() {
        //1 首先要通过中介者去除掉所有与这个部门相关的部门和人员关系
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);
        return true;
    }

}
