package com.barclaysbank.rewards.process.builder;

import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.balance.dao.entity.DAO_BalanceInfo;
import com.barclaysbank.rewards.process.beans.Process_BalanceResp;

@Component
public class Process_BalanceRespBuilder {
	public Process_BalanceResp build(DAO_BalanceInfo daoBalInfo) {
		Process_BalanceResp balResp = new Process_BalanceResp();
		balResp.setAvailablePts(daoBalInfo.getAvailablePts());
		balResp.setEarnedPts(daoBalInfo.getEarnedPts());
		balResp.setPendingPts(daoBalInfo.getPendingPts());
		balResp.setUsedPts(daoBalInfo.getUsedPts());
		return balResp;
	}

}
