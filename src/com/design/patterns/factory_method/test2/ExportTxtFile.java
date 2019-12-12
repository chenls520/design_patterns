package com.design.patterns.factory_method.test2;

/**
 * 导出成文本文件格式的对象
 * @author chenliangsen
 * @date 2019/12/12 10:19
 */
public class ExportTxtFile implements ExportFileApi{
    @Override
    public boolean export(String data) {
        //简单示意一下，这里需要操作文件
        System.out.println("导出数据" + data + " 到文本文件");
        return true;
    }
}
