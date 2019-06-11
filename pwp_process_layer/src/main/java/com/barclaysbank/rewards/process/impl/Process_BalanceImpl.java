package com.barclaysbank.rewards.process.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclaysbank.rewards.balance.dao.entity.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.dao.impl.DAO_BalanceImpl;
import com.barclaysbank.rewards.process.Process_Balance_I;
import com.barclaysbank.rewards.process.beans.Process_BalanceResp;
import com.barclaysbank.rewards.process.builder.Process_BalanceRespBuilder;

@Service
public class Process_BalanceImpl implements Process_Balance_I{
	private final static Logger logger = LoggerFactory.getLogger(Process_BalanceImpl.class);
	@Autowired
	DAO_BalanceImpl dao;
	@Autowired
	Process_BalanceRespBuilder respBuilder;

	@Override
	public Process_BalanceResp getBalance(String cardNum) {
		logger.debug("#### Enter into getBalance() #### cardNum :"+cardNum+" ####");
		DAO_BalanceInfo daoBalInfo = dao.getBalance(cardNum);
		Process_BalanceResp processBalanceResp = respBuilder.build(daoBalInfo);
		logger.info("#### Exit from getBalance()  #### Process_BalanceResp : "+processBalanceResp+" ####");
		return processBalanceResp;
	}

}
