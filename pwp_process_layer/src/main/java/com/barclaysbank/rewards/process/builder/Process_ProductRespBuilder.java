package com.barclaysbank.rewards.process.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.process.beans.Process_ProductInfo;
import com.barclaysbank.rewards.process.beans.Process_ProductResp;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;

@Component
public class Process_ProductRespBuilder {
	public Process_ProductResp build(List<DAO_ProductInfo> dpInfos) {
		Process_ProductResp processProductResp = new Process_ProductResp();
		List<Process_ProductInfo> processProductInfo = new ArrayList<Process_ProductInfo>();
		for(DAO_ProductInfo dpInfo : dpInfos ) {
			Process_ProductInfo prodInfo = new Process_ProductInfo();
			prodInfo.setDescription(dpInfo.getDescription());
			prodInfo.setName(dpInfo.getName());
			prodInfo.setPrice(dpInfo.getPrice());
			prodInfo.setVendorName(dpInfo.getVendorName());
			processProductInfo.add(prodInfo);
		}
		processProductResp.setProductInfoList(processProductInfo);
		return processProductResp;
	}

}
