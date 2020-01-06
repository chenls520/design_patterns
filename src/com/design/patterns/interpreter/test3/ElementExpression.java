package com.design.patterns.interpreter.test3;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 元素作为非终结符对应的解释器，解释并执行中间元素
 * @author chenliangsen
 * @date 2020/1/6 9:33
 */
public class ElementExpression extends ReadXmlExpression {
    /**
     * 用来记录组合的ReadXmlExpression元素
     */
    private Collection<ReadXmlExpression> eles =
            new ArrayList<ReadXmlExpression>();
    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }

    public boolean removeEle(ReadXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }

    @Override
    public String[] interpret(Context c) {
        Element ele = null;
        //先取出上下文中的当前元素作为父级元素
        //查找当前元素名称所对应的xml元素，并设置回到上下文中
        List<Element> preEles = c.getPreEles();
        List<Element> nowEles = new ArrayList<Element>();
        if (preEles.size() == 0) {
            //说明获取的是根元素
            ele = c.getDocument().getDocumentElement();
            preEles.add(ele);
            c.setPreEles(preEles);
        } else {
            for (Element tempEle : preEles) {
                nowEles.addAll(c.getNowEles(tempEle, eleName));
                if (nowEles.size() > 0) {
                    //找到一个就停止
                    break;
                }
            }
            List<Element> tempList = new ArrayList<Element>();
            tempList.add(nowEles.get(0));
            c.setPreEles(tempList);

        }
        //循环调用子元素的interpret方法
        String[] ss = null;
        for (ReadXmlExpression tempEle : eles) {
            ss = tempEle.interpret(c);
        }
        return ss;
    }
}
