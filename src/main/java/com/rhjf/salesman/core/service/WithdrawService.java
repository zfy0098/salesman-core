package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;

/**
 * Created by hadoop on 2017/8/29.
 */
public interface WithdrawService {




    /**
     * 用户提现
     **/
    public ParamterData txProfit(LoginUser user, ParamterData paramter);


    /**
     * 提现记录
     **/
    public ParamterData TxRecordList(LoginUser user, ParamterData paramter);

}
