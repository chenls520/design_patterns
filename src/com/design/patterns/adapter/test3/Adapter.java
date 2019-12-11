package com.design.patterns.adapter.test3;

import com.design.patterns.adapter.test1.LogFileOperateApi;
import com.design.patterns.adapter.test1.LogModel;

import java.util.List;

/**
 * 适配器对象，将记录日志到文件的功能适配成第二版需要的增删改查功能
 * @author chenliangsen
 * @date 2019/12/11 9:54
 */
public class Adapter implements LogDbOperateApi{
    /**
     * 持有需要被适配的接口对象
     */
    private LogFileOperateApi adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel logModel) {
        //先读取文件的内容
        List<LogModel> logModels = adaptee.readLogFile();
        //加入新的日志对象
        logModels.add(logModel);
        //重新写入文件
        adaptee.writeLogFile(logModels);
    }

    @Override
    public void updateLog(LogModel logModel) {
        //先读取文件的内容
        List<LogModel> logModels = adaptee.readLogFile();
        //修改对应的日志对象
        for (int i = 0; i < logModels.size(); i++) {
            if (logModels.get(i).getLogId().equals(logModel.getLogId())) {
                logModels.set(i, logModel);
            }
        }
        //重新写入文件
        adaptee.writeLogFile(logModels);

    }

    @Override
    public void removeLog(LogModel logModel) {
        //先读取文件的内容
        List<LogModel> logModels = adaptee.readLogFile();
        //删除对应的日志对象
        logModels.remove(logModel);
        //重新写入文件
        adaptee.writeLogFile(logModels);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
