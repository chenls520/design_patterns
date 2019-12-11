package com.design.patterns.adapter.test3;

import com.design.patterns.adapter.test1.LogFileOperate;
import com.design.patterns.adapter.test1.LogFileOperateApi;
import com.design.patterns.adapter.test1.LogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenliangsen
 * @date 2019/12/11 10:01
 */
public class Client {
    public static void main(String[] args) {
        //准备日志内容，也就是测试数据
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2010-03-02 10:08:18");
        logModel.setLogContent("测试");
        ArrayList<LogModel> list = new ArrayList<>();
        list.add(logModel);
        //创建操作日志文件的对象
        LogFileOperateApi logFileOperateApi = new LogFileOperate("");
        //创建新版操作日志的接口对象
        LogDbOperateApi logDbOperateApi = new Adapter(logFileOperateApi);
        //保存日志文件
        logDbOperateApi.createLog(logModel);
        //读取日志文件内容
        List<LogModel> allLog = logDbOperateApi.getAllLog();
        System.out.println("allLog=" + allLog);
    }
}
