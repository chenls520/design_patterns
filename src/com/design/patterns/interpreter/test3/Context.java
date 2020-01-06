package com.design.patterns.interpreter.test3;

import com.design.patterns.interpreter.test2.XmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 上下文，用来包含解释器需要的一些全局信息
 * @author chenliangsen
 * @date 2020/1/6 9:21
 */
public class Context {
    /**
     * Dom解析xml的Document对象
     */
    private Document document = null;

    /**
     * 上一次被处理的多个元素
     */
    private List<Element> preEles = new ArrayList<Element>();

    public Context(String filePathName) throws IOException, SAXException, ParserConfigurationException {
        //通过辅助的xml工具类来获取被解析的xml对应的Document对象
        this.document = XmlUtil.getRoot(filePathName);
    }

    /**
     * 重新初始化上下文
     */
    public void reInit() {
        preEles = new ArrayList<Element>();
    }

    public List<Element> getNowEles(Element pEle, String eleName) {
        List<Element> elements = new ArrayList<Element>();
        NodeList childNodes = pEle.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (childNodes.item(i) instanceof Element) {
                Element nowEle = (Element) childNodes.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    elements.add(nowEle);
                }
            }
        }
        return elements;
    }

    public void setPreEles(List<Element> preEles) {
        this.preEles = preEles;
    }

    public List<Element> getPreEles() {
        return preEles;
    }

    public Document getDocument() {
        return document;
    }
}
