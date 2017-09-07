package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;
import com.rhjf.account.modle.domain.salesman.TermKey;

public interface LoginService {


    /**
     * 获取用户信息
     **/
    public LoginUser userInfo(String LoginID);


    /**
     * 获取用户秘钥
     **/
    public TermKey userTermkey(String userID);


    /**
     * 业务员登录
     **/
    public ParamterData login(LoginUser user, ParamterData paramter);


    /**
     * 签到
     **/
    public ParamterData sign(LoginUser user, ParamterData paramter);


    /**
     * 校验密码 是否正确
     */
    public ParamterData verifyPassword(LoginUser user, ParamterData paramter);


    /**
     *   向邮箱发送验证码
     */
    public ParamterData verificationEmail(LoginUser user, ParamterData paramterData);


    /**
     * 忘记密码
     **/
    public ParamterData forgetpwd(LoginUser user, ParamterData paramter);


    /**
     *  更改密码
     */
    public ParamterData updatePassword(LoginUser user, ParamterData paramter);


    /**
     * 某一个商户为业务员制造的收益
     **/
    public ParamterData queryMerchantTotalAmount(LoginUser user, ParamterData paramter);


    /**
     * 根据银行卡号获取银行名称
     **/
    public ParamterData getBankName(LoginUser user, ParamterData paramter);




}
