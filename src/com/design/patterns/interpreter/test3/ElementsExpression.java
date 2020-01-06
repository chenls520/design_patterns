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
public class ElementsExpression extends ReadXmlExpression {
    /**
     * 用来记录组合的ReadXmlExpression元素
     */
    private Collection<ReadXmlExpression> eles =
            new ArrayList<ReadXmlExpression>();
    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementsExpression(String eleName) {
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
        List<Element> preEles = c.getPreEles();
        List<Element> nowEles = new ArrayList<Element>();

        for (Element ele : preEles) {
            nowEles.addAll(c.getNowEles(ele, eleName));
        }
        c.setPreEles(nowEles);


        //循环调用子元素的interpret方法
        String[] ss = null;
        for (ReadXmlExpression tempEle : eles) {
            ss = tempEle.interpret(c);
        }
        return ss;
    }
}
