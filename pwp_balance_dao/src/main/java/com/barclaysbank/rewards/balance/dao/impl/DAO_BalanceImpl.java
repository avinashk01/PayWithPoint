package com.barclaysbank.rewards.balance.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.balance.dao.DAO_Balance_I;
import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceReq;
import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceResp;
import com.barclaysbank.rewards.balance.dao.builder.DAO_BalanceRespBuilder;
import com.barclaysbank.rewards.balance.repository.BalanceJPARepository;

@Repository
public class DAO_BalanceImpl implements DAO_Balance_I{
	
	@Autowired
	BalanceJPARepository balanceJPARepository;
	
	@Autowired
	DAO_BalanceRespBuilder respBuilder; 

	@Override
	public DAO_BalanceResp getBalance(DAO_BalanceReq req){

		DAO_BalanceInfo balanceInfo = balanceJPARepository.findByCardNum("5298000100296314");
		DAO_BalanceResp balanceResp = respBuilder.buildBalanceResp(balanceInfo);
		
		return balanceResp;
	}

}












