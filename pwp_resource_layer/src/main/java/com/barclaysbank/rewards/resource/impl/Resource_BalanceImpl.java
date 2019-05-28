package com.barclaysbank.rewards.resource.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclaysbank.rewards.resource.Resource_Balance_I;
import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;
import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;
import com.barclaysbank.rewards.resource.beans.Resource_RequestBody;
import com.barclaysbank.rewards.resource.beans.Resource_ServiceDtls;
import com.sun.xml.internal.ws.api.policy.PolicyResolver.ClientContext;

@RestController
@RequestMapping("/balance")
public class Resource_BalanceImpl implements Resource_Balance_I{
	
	@GetMapping(value="{cardNum}",produces={"application/json"})
	@ResponseBody
	public Resource_BalanceResp getBalance(
			@PathVariable("cardNum") String cardNum,
			@RequestHeader ClientContext clientContext,
			@RequestBody Resource_RequestBody reqBody
			) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

	
	
	

}

