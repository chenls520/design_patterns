package com.design.patterns.template_method.test1;

/**
 * 描述工作人员信息的数据模型
 * @author chenliangsen
 * @date 2019/12/26 9:40
 */
public class WorkerModel {
    private String uuid, workerId, pwd, name;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
