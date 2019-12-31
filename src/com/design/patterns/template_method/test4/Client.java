package com.design.patterns.template_method.test4;

import com.design.patterns.template_method.test3.LoginTemplate;

/**
 * @author chenliangsen
 * @date 2019/12/26 11:14
 */
public class Client {
    public static void main(String[] args) {
        NormalLoginModel nlm = new NormalLoginModel();
        nlm.setLoginId("testUser");
        nlm.setPwd("testPwd");
        nlm.setQuestion("testQuestion");
        nlm.setAnswer("testAnswer");

        LoginTemplate lt3 = new NormalLogin2();
        boolean flag3 = lt3.login(nlm);
        System.out.println("可以进行普通人员加强版登录=" + flag3);

    }
}
