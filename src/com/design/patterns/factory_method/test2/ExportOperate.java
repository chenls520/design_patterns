package com.design.patterns.factory_method.test2;

/**
 * 实现导出数据的业务功能对象
 * @author chenliangsen
 * @date 2019/12/12 10:22
 */
public abstract class ExportOperate {
    public boolean export(String data) {
        //使用工厂方法
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * @return 导出的文件对象的接口对象
     */
    public abstract ExportFileApi factoryMethod();
}
