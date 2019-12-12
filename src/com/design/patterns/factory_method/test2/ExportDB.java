package com.design.patterns.factory_method.test2;

/**
 * 导出成数据库备份文件形式的对象
 * @author chenliangsen
 * @date 2019/12/12 10:20
 */
public class ExportDB implements ExportFileApi{
    @Override
    public boolean export(String data) {
        //简单示意一下，这里需要操作数据库和文件
        System.out.println("导出数据" + data + "到数据库备份文件");
        return true;
    }
}
