package com.design.patterns.factory_method.test2;

/**
 * 具体的创建器实现对象，实现创建导出成文本文件格式的对象
 * @author chenliangsen
 * @date 2019/12/12 10:24
 */
public class ExportTxtFileOperate  extends ExportOperate{
    @Override
    public ExportFileApi factoryMethod() {
        //创建导出文本文件格式的对象
        return new ExportTxtFile();
    }
}
