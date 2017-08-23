package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;

/**
 *
 *   信用卡功能接口
 *
 *
 * Created by hadoop on 2017/8/9.
 */
public interface CreaditCardService {


    /**
     *   获取信用卡开通银行列表
     * @param paramter
     * @return
     */
    public ParamterData GetBank(ParamterData paramter);


    /**
     *   申请信用卡
     * @param user
     * @param paramter
     * @return
     */
    public ParamterData applyForCard(LoginUser user , ParamterData paramter);


}
