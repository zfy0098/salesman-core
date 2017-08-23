package com.rhjf.salesman.core.util;

import com.rhjf.salesman.core.constants.Constants;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

/**
 * Created by hadoop on 2017/8/7.
 */
public class MakeCipherText {



    public  String calLoginPwd(String usrID,String pwd ,String sendTime){
        // 加密
        try {
            // 解析密码明文
            String keyde = new String(DESUtil.decrypt3(pwd, Constants.protectINDEX));
            return MD5.sign(usrID + sendTime + keyde.replace(" ", "") ,"utf-8" );

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
