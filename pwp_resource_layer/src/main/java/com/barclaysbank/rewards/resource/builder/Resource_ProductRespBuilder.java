package com.barclaysbank.rewards.resource.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.process.beans.Process_ProductInfo;
import com.barclaysbank.rewards.process.beans.Process_ProductResp;
import com.barclaysbank.rewards.resource.beans.Resource_ProductInfo;
import com.barclaysbank.rewards.resource.beans.Resource_ProductResp;

@Component
public class Resource_ProductRespBuilder {
	public Resource_ProductResp build(Process_ProductResp ppResp) {
		Resource_ProductResp resourceProductresp = new Resource_ProductResp();
		List<Resource_ProductInfo> productInfo = new ArrayList<Resource_ProductInfo>();
		for(Process_ProductInfo ppInfo : ppResp.getProductInfoList()) {
			Resource_ProductInfo rpInfo = new Resource_ProductInfo();
			BeanUtils.copyProperties(ppInfo, rpInfo);
			productInfo.add(rpInfo);
		}
		resourceProductresp.setProductList(productInfo);
		return resourceProductresp;
	}
	
	
	
	
	
	
	
	
	

}
