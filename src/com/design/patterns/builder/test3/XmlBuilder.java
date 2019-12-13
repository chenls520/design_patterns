package com.design.patterns.builder.test3;

import com.design.patterns.builder.test1.ExportDataModel;
import com.design.patterns.builder.test1.ExportFooterModel;
import com.design.patterns.builder.test1.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 实现导出数据到XML文件的生成器对象
 *
 * @author chenliangsen
 * @date 2019/12/13 11:16
 */
public class XmlBuilder implements Builder {

    /**
     * 用来记录构建的文件的内容，相当于产品
     */
    StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        buffer.append("<Report>\n");
        buffer.append("  <Header>\n");
        buffer.append("    <DepId>" + ehm.getDepId() + "</DepId>\n");
        buffer.append("    <ExportDate>" + ehm.getExportDate() + "</ExportDate>\n");
        buffer.append("  </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        buffer.append("  <Body>\n");
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            buffer.append("    <Datas TableName=\"" + tblName + "\">\n");
            //然后循环拼接具体的数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append("        <Data>\n");
                buffer.append("            <ProductId>" + edm.getProductId() + "</ProductId>\n");
                buffer.append("            <Price>" + edm.getPrice() + "</Price>\n");
                buffer.append("            <Amount>" + edm.getAmount() + "</Amount>\n");
                buffer.append("        </Data>\n");
            }
            buffer.append("    </Datas>\n");
        }
        buffer.append("  </Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append("  <Footer>\n");
        buffer.append("    <ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        buffer.append("  </Footer>\n");
        buffer.append("</Report>\n");
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
