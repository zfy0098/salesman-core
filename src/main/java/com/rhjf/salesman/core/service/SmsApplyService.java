package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.ParamterData;

/**
 * Created by hadoop on 2017/8/11.
 */
public interface SmsApplyService {


    /**
     *  获取短信验证码
     * @param repData
     * @return
     */
    public ParamterData send(ParamterData repData);


    /**
     *   验证短信验证码
     * @param paramterData
     * @return
     */
    public ParamterData verificationSMSCode(ParamterData paramterData);

}
