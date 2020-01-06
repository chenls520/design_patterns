package com.design.patterns.interpreter.test3;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 元素作为终结符对应的解释器
 * @author chenliangsen
 * @date 2020/1/6 9:39
 */
public class ElementsTerminalExpression extends ReadXmlExpression {
    /**
     * 元素的名字
     */
    private String eleName = "";

    public ElementsTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context c) {
        //先取出上下文中的当前元素作为父级元素
        List<Element> preEles = c.getPreEles();

        List<Element> nowEles = new ArrayList<Element>();

        for (Element ele : preEles) {
            nowEles.addAll(c.getNowEles(ele, eleName));
        }

        //然后需要去获取这个元素的值
        String[] ss = new String[nowEles.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = nowEles.get(i).getFirstChild().getNodeValue();
        }
        return ss;
    }
}
