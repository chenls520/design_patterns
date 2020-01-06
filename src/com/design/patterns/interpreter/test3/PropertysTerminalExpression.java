package com.design.patterns.interpreter.test3;


import org.w3c.dom.Element;

import java.util.List;

/**
 * 属性作为终结符对应的解释器
 * @author chenliangsen
 * @date 2020/1/6 10:02
 */
public class PropertysTerminalExpression extends ReadXmlExpression {
    /**
     * 属性的名字
     */
    private String propName;

    public PropertysTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Context c) {
        List<Element> preEles = c.getPreEles();

        //直接获取最后的元素属性的值
        String[] ss = new String[preEles.size()];
        for (int i = 0; i <ss.length; i++) {
            ss[i] = preEles.get(i).getAttribute(this.propName);
        }
        return ss;
    }
}
