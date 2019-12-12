package com.design.patterns.factory_method.test2;


/**
 * 具体的创建器实现对象，实现创建导出成数据库备份文件形式的对象
 * @author chenliangsen
 * @date 2019/12/12 10:25
 */
public class ExportDBOperate extends ExportOperate{
    @Override
    public ExportFileApi factoryMethod() {
        //创建导出成数据库备份文件形式的对象
        return new ExportDB();
    }
}
