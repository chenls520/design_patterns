package com.design.patterns.interpreter.test2;


import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author chenliangsen
 * @date 2020/1/6 9:23
 */
public class XmlUtil {
    public static Document getRoot(String filePathName) throws ParserConfigurationException, IOException, SAXException {
        Document doc = null;
        //建立一个解析器工厂
        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();
        //获得一个DocumentBuilder对象，这个对象代表了具体的Dom解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        //得到一个表示xml文档的Document对象
        doc = builder.parse(filePathName);
        //去掉xml文档中作为格式化内容的空白而映射在Dom树中的TextNode对象
        doc.normalize();
        return doc;
    }
}
