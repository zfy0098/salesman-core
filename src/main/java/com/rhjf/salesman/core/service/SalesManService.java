package com.rhjf.salesman.core.service;

import com.rhjf.account.modle.domain.salesman.LoginUser;
import com.rhjf.account.modle.domain.salesman.ParamterData;

public interface SalesManService {

	/**
	 *   修改结算信息
	 * @param user
	 * @param Paramter
	 * @return
	 */
	public ParamterData updateBankInfo(LoginUser user , ParamterData Paramter);
}
