package com.design.patterns.template_method.test5;

import com.design.patterns.template_method.test3.LoginModel;

/**
 * 登录控制的模板方法需要的回调接口，需要把所有的接口方法都定义出来
 * 或者说是所有可以被扩展的方法都需要被定义出来
 */
public interface LoginCallback {
    /**
     * 根据登录编号来查找和获取存储中相应的数据
     * @param loginId 登录编号
     * @return 登录编号再存储中相对应的数据
     */
    public LoginModel findLoginUser(String loginId);

    /**
     * 对密码数据进行加密
     * @param pwd 密码数据
     * @param template LoginTemplate对象，通过它来调用在LoginTemplate中定义的公共方法或默认实现
     * @return 加密或的密码数据
     */
    public String encryptPwd(String pwd, LoginTemplate template);

    /**
     * 判断用户填写的登录数据和存储中对应的数据是否匹配的上
     * @param lm 用户填写的登录数据
     * @param dbLm 存储中对应的数据
     * @param template LoginTemplate对象，通过它来调用在LoginTemplate中定义的公共方法或默认实现
     * @return true表示匹配成功，false表示匹配失败
     */
    public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template);
}
