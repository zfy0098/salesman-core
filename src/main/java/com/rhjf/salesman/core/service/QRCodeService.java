package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;

/**
 * Created by hadoop on 2017/8/21.
 */
public interface QRCodeService {


    /**
     *   绑定固定码
     * @param user
     * @param paramter
     * @return
     */
    public ParamterData BindedYMF(LoginUser user , ParamterData paramter);
}
