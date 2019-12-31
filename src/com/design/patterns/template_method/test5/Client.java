package com.design.patterns.template_method.test5;

import com.design.patterns.template_method.test3.LoginModel;

/**
 * @author chenliangsen
 * @date 2019/12/30 10:54
 */
public class Client {
    public static void main(String[] args) {
        LoginModel lm = new LoginModel();

        lm.setLoginId("admin");
        lm.setPwd("workerpwd");

        LoginTemplate lt = new LoginTemplate();
        boolean flag = lt.login(lm, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                //这里省略具体的处理，仅做示意，返回一个有默认数据的对象
                LoginModel loginModel = new LoginModel();
                loginModel.setLoginId(loginId);
                loginModel.setPwd("testpwd");
                return loginModel;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                //自己不需要覆盖，直接转调模板中的默认实现
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
                //自己不需要覆盖，直接转调模板中的默认实现
                return template.match(lm, dbLm);
            }
        });

        System.out.println("可以进行普通人员登录" + flag);
        boolean flag2 = lt.login(lm, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                //这里省略具体的处理，仅做示意，返回一个有默认数据的对象
                LoginModel loginModel = new LoginModel();
                loginModel.setLoginId(loginId);
                loginModel.setPwd("workerpwd");
                return loginModel;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                //自己不需要覆盖，直接转调模板中的默认实现
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
                //自己不需要覆盖，直接转调模板中的默认实现
                return template.match(lm, dbLm);
            }
        });
        System.out.println("可以登录工作平台" + flag2);
    }
}
