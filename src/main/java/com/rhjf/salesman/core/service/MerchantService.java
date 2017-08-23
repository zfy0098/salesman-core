package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;
import org.apache.zookeeper.Login;
import sun.rmi.runtime.Log;

import java.awt.print.PrinterAbortException;

/**
 * Created by hadoop on 2017/8/11.
 */
public interface MerchantService {


    /**  录入商户 **/
    public ParamterData inputMerchant(LoginUser user  , ParamterData paramter);



    /**  上传商户照片 **/
    public ParamterData updatePhoto(LoginUser user , ParamterData paramterData);



    /**  商户列表	 **/
    public ParamterData merchantlist(LoginUser user, ParamterData paramter);


    /** 修改商户等级 **/
    public ParamterData updateMerchantLevel(LoginUser user, ParamterData paramter);



    /**  为商户添加信用卡 **/
    public ParamterData addCreditCardNo(LoginUser user , ParamterData paramter);
}
