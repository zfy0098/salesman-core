package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.ParamterData;

/**
 * Created by hadoop on 2017/8/10.
 */
public interface BankCodeService {


    /**
     *   获取支行名称列表
     * @param paramterData
     * @return
     */
    public ParamterData bankBranchList(ParamterData paramterData);
}
