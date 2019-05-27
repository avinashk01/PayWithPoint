package com.barclaysbank.rewards.resource.impl;

import org.springframework.web.bind.annotation.RequestMapping;

import com.barclaysbank.rewards.resource.Resource_Product_I;
import com.barclaysbank.rewards.resource.beans.Resource_ProductResp;

@RequestMapping("/product")
public class Resource_ProductImpl implements Resource_Product_I{

	@Override
	public Resource_ProductResp getProduct(String clientId, String channelId, String cardNum, String corelationId,
			String msgTs) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
