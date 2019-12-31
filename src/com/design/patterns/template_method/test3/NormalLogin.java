package com.design.patterns.template_method.test3;

/**
 * 普通用户登录控制的逻辑处理
 * @author chenliangsen
 * @date 2019/12/26 10:47
 */
public class NormalLogin extends LoginTemplate {

    @Override
    protected LoginModel findLoginUser(String loginId) {
        //这里省略具体的处理，仅做示意，返回一个有默认数据的对象
        LoginModel loginModel = new LoginModel();
        loginModel.setLoginId(loginId);
        loginModel.setPwd("test");
        return loginModel;
    }
}
