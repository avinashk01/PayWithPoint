package com.barclaysbank.rewards.resource.builder;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.process.beans.Process_BalanceResp;
import com.barclaysbank.rewards.resource.beans.Resource_BalanceInfo;
import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;
import com.barclaysbank.rewards.resource.beans.Resource_StatusBlock;

@Component
public class Resource_BalanceRespBuilder {
	public Resource_BalanceResp build(Process_BalanceResp pbResp) {
		Resource_BalanceResp rbResp = new Resource_BalanceResp();
		Resource_BalanceInfo balInfo = new Resource_BalanceInfo();		
		//BeanUtils.copyProperties(pbResp, balInfo);
		balInfo.setAvailablePts(pbResp.getAvailablePts());
		balInfo.setEarnedPts(pbResp.getEarnedPts());
		balInfo.setPendingPts(pbResp.getPendingPts());
		balInfo.setUsedPts(pbResp.getUsedPts());
		rbResp.setBalInfo(balInfo);
		return rbResp;
		
	}

}
