package com.design.patterns.interpreter.test3;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author chenliangsen
 * @date 2020/1/6 10:04
 */
public class Client {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Context c = new Context("test.xml");
        ReadXmlExpression re = Parser.parse("root/a/b/d$.id$");
        String ss[] = re.interpret(c);
        for (String s : ss) {
            System.out.println("d的属性id值是=" + s);
        }
        c.reInit();
        ReadXmlExpression re2 = Parser.parse("root/a/b/d$");
        String ss2[] = re.interpret(c);
        for (String s : ss2) {
            System.out.println("d值是=" + s);
        }
    }
}
