package com.design.patterns.interpreter.test2;

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
     * 上一个被处理的元素
     */
    private Element preEle = null;

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
        preEle = null;
    }

    /**
     * 各个Expression公共使用的方法
     * 根据父元素和当前元素的名称来获取当前的元素
     * @param pEle 父元素
     * @param eleName 当前元素的名称
     * @return 找到的当前元素
     */
    public Element getNowEle(Element pEle, String eleName) {
        NodeList tempNodeList = pEle.getChildNodes();
        for (int i = 0; i < tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                Element nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    return nowEle;
                }
            }
        }
        return null;
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

    public Element getPreEle() {
        return preEle;
    }

    public void setPreEle(Element preEle) {
        this.preEle = preEle;
    }

    public Document getDocument() {
        return document;
    }
}
