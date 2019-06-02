package com.barclaysbank.rewards.resource.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.process.beans.Process_RedeemInfo;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;
import com.barclaysbank.rewards.resource.beans.Resource_RedeemInfo;
import com.barclaysbank.rewards.resource.beans.Resource_RedeemResp;
@Component
public class Resource_RedeemRespBuilder {
	public Resource_RedeemResp build(Process_RedeemResp processRedeemResp) {
		Resource_RedeemResp resourceRedeemResp = new Resource_RedeemResp();
		List<Resource_RedeemInfo> rrInfoList = new ArrayList<Resource_RedeemInfo>();
		for(Process_RedeemInfo prInfo : processRedeemResp.getRedeemInfoList() ) {
			Resource_RedeemInfo rrInfo = new Resource_RedeemInfo();
			BeanUtils.copyProperties(prInfo, rrInfo);
			rrInfoList.add(rrInfo);
		}
		resourceRedeemResp.setRedeemInfoList(rrInfoList);
		return resourceRedeemResp;
	}
	
	
	
	
	
	
	
	
	

}
