package com.barclaysbank.rewards.process.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.process.beans.Process_RedeemInfo;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;
import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;

@Component
public class Process_RedeemRespBuilder {
	public Process_RedeemResp build(List<DAO_RedeemProductInfo> drpInfos) {
		Process_RedeemResp processredeemResp = new Process_RedeemResp();
		List<Process_RedeemInfo> prRespList = new ArrayList<Process_RedeemInfo>();
		for(DAO_RedeemProductInfo drpInfo : drpInfos) {
			Process_RedeemInfo redeemInfo = new Process_RedeemInfo();
			redeemInfo.setDeliveryDate(drpInfo.getDeliveryDate());
			redeemInfo.setOrderId(drpInfo.getOrderId());
			redeemInfo.setPrice(drpInfo.getPrice());
			redeemInfo.setProductName(drpInfo.getProductName());
			redeemInfo.setPurchaseDate(drpInfo.getPurchaseDate());
			prRespList.add(redeemInfo);
		}
		processredeemResp.setRedeemInfoList(prRespList);
		return processredeemResp;
	}

	
	
	
	
}
