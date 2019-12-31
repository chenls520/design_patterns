package com.design.patterns.template_method.test3;

/**
 * @author chenliangsen
 * @date 2019/12/26 10:51
 */
public class Client {
    public static void main(String[] args) {
        LoginModel loginModel = new LoginModel();
        loginModel.setLoginId("admin");
        loginModel.setPwd("workerPwd");

        LoginTemplate lt1 = new WorkerLogin();
        LoginTemplate lt2 = new NormalLogin();

        boolean flag = lt1.login(loginModel);
        System.out.println("可以登录工作平台==" + flag);

        boolean flag2 = lt2.login(loginModel);
        System.out.println("可以进行普通人员登录==" + flag2);

    }
}
