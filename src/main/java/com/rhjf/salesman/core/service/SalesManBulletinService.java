package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;

/**
 * Created by hadoop on 2017/8/4.
 */
public interface SalesManBulletinService {


    /**
     *    显示公告列表
     * @param user
     * @param paramter
     * @return
     */
    public ParamterData salesmanBulletinList(LoginUser user, ParamterData paramter);


    /**
     *   显示公告详细
     * @param user
     * @param paramter
     * @return
     */
    public ParamterData salesmanBulletinDetail(LoginUser user , ParamterData paramter);


}
