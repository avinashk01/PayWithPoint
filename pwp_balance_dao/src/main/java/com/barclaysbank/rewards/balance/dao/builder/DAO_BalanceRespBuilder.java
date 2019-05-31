package com.barclaysbank.rewards.balance.dao.builder;

import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceResp;
import com.barclaysbank.rewards.balance.dao.beans.DAO_StatusBlock;

@Component
public class DAO_BalanceRespBuilder {
	
	public DAO_BalanceResp buildBalanceResp(DAO_BalanceInfo balanceInfo) {
		DAO_StatusBlock statusBlock = null;
		DAO_BalanceResp balanceResp = new DAO_BalanceResp();
		if(balanceInfo == null) {
			statusBlock = new DAO_StatusBlock("106");
			
		}
		
		balanceResp.setBalanceInfo(balanceInfo);
		balanceResp.setStatusBlock(statusBlock);
		
		return balanceResp;
	}
	
	
	
	
	
	

}
