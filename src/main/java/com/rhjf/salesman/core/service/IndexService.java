package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;
/**
 * Created by hadoop on 2017/8/7.
 *
 * @author hadoop
 */

public interface IndexService {


    public ParamterData index(LoginUser user , ParamterData paramter);

}
