package com.design.patterns.interpreter.test2;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author chenliangsen
 * @date 2020/1/6 10:04
 */
public class Client {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Context c = new Context("test.xml");
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementTerminalExpression cEle = new ElementTerminalExpression("c");
//        ElementTerminalExpression dEle = new ElementTerminalExpression("d");
        PropertyTerminalExpression prop = new PropertyTerminalExpression("name");
        root.addEle(aEle);
        root.addEle(bEle);
        root.addEle(cEle);
        root.addEle(prop);
//        root.addEle(dEle);
        String[] ss = root.interpret(c);
        System.out.println(Arrays.toString(ss));
        c.reInit();
        String[] ss2 = root.interpret(c);
        System.out.println(Arrays.toString(ss2));
    }
}
