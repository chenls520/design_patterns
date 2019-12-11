package com.design.patterns.adapter.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenliangsen
 * @date 2019/12/11 9:32
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
        LogFileOperateApi api = new LogFileOperate("");
        //保存日志文件
        api.writeLogFile(list);
        //读取日志文件的内容
        List<LogModel> logModels = api.readLogFile();
        System.out.println("readLog = " + logModels);
    }
}
