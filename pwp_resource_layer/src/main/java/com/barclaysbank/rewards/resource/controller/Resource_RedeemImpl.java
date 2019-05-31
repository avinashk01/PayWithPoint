package com.barclaysbank.rewards.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;

@RestController
@RequestMapping("/pwpservice/redeem")
public class Resource_RedeemImpl{

	@GetMapping(value="{cardNum}",produces={"application/json"})
	public String getRedeem(
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
