package com.design.patterns.adapter.test1;

import java.io.*;
import java.util.List;

/**
 * 实现对日志文件的操作
 * @author chenliangsen
 * @date 2019/12/11 9:24
 */
public class LogFileOperate  implements LogFileOperateApi{
    /**
     * 日志文件的路径和文件名称，默认是当前项目根下的AdapterLog.log
     */
    private String logFilePathName = "AdapterLog.log";

    /**
     * 构造方法，传入文件的路径和名称
     * @param logFilePathName 文件的路径和名称
     */
    public LogFileOperate(String logFilePathName) {
        //先判断是否传入了文件的路径和名称，如果是就重新设置操作的日志文件的路径和名称
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }

    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> result = null;
        ObjectInputStream oin = null;
        File file = new File(logFilePathName);
        if (file.exists()) {
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                result = (List<LogModel>) oin.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (oin != null) {
                        oin.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oout != null) {
                    oout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
