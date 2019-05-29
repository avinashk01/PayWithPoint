package com.barclaysbank.rewards.resource.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;

@RequestMapping("/pwpservice/product")
public class Resource_ProductImpl{

	public String getProduct(
			@PathVariable("cardNum") String cardNum,
			@RequestHeader("msgTs") String msgTs,
			@RequestHeader("clientId") String clientId,
			@RequestHeader("channelId") String channelId,
			@RequestHeader("correlationId") String correlationId,
			@RequestBody Resource_CustomerContext custContext
			) {
		
		return cardNum+"  "+msgTs+"  "+clientId+"  "+channelId+"  "+correlationId+"  "+custContext;
	}


	
	
}
