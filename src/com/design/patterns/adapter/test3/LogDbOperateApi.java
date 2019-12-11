package com.design.patterns.adapter.test3;

import com.design.patterns.adapter.test1.LogModel;

import java.util.List;

/**
 * 定义操作日志的应用接口，为了实例的简单，只是简单的定义了增删改查的方法
 */
public interface LogDbOperateApi {
    /**
     * 新增日志
     * @param logModel 需要新增的日志对象
     */
    public void createLog(LogModel logModel);

    /**
     * 修改日志
     * @param logModel 需要修改的日志对象
     */
    public void updateLog(LogModel logModel);

    /**
     * 删除日志
     * @param logModel 需要删除的日志对象
     */
    public void removeLog(LogModel logModel);

    /**
     * 获取所有的日志
     * @return 所有的日志对象
     */
    public List<LogModel> getAllLog();
}
