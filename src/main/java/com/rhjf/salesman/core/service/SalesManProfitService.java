package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;

/**
 * Created by hadoop on 2017/8/4.
 *
 *
 *   业务员收益查询
 */
public interface SalesManProfitService {




    /**
     *   查询收益明细
     * @param user
     * @param paramter
     * @return
     */
    public ParamterData profitDetailByDay(LoginUser user , ParamterData paramter);



    /**
     *      收益明细 折线数据
     * @return
     */
    public ParamterData profitDetailByToDayCurve(LoginUser user,ParamterData paramter);



    /**
     *  月报收益
     * @param user
     * @return
     */
    public ParamterData monthlyReport(LoginUser user , ParamterData paramterData);


    /**
     *   某月收益详细
     * @param user
     * @param paramterData
     * @return
     */
    public ParamterData monthlyReportDetailed(LoginUser user, ParamterData paramterData);


    /**
     * 月报详细折线数据
     * @param user
     * @param paramterData
     * @return
     */
    public ParamterData monthlyReportCurve(LoginUser user,ParamterData paramterData);

}
