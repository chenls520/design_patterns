package com.design.patterns.template_method.test3;


/**
 * 工作人员登录控制的逻辑处理
 * @author chenliangsen
 * @date 2019/12/26 9:37
 */
public class WorkerLogin extends LoginTemplate{

    /**
     * 对密码数据进行加密
     * @param pwd 密码数据
     * @return 加密后的密码数据
     */
    @Override
    public String encryptPwd(String pwd) {
        //这里对密码进行加密，省略了
        System.out.println("使用MD5进行加密");
        return pwd;
    }


    /**
     * 根据工作人员编号获取工作人员的详细信息
     * @param loginId 工作人员编号
     * @return 对应的工作人员的详细信息
     */
    @Override
    protected LoginModel findLoginUser(String loginId) {
        //这里省略具体的处理，仅做示意，返回一个有默认数据的对象
        LoginModel loginModel = new LoginModel();
        loginModel.setLoginId(loginId);
        loginModel.setPwd("workerPwd");
        return loginModel;
    }
}
