package com.barclaysbank.rewards.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclaysbank.rewards.exception.BadRequestException;
import com.barclaysbank.rewards.process.beans.Process_BalanceResp;
import com.barclaysbank.rewards.process.impl.Process_BalanceImpl;
import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;
import com.barclaysbank.rewards.resource.beans.Resource_StatusBlock;
import com.barclaysbank.rewards.resource.builder.Resource_BalanceReqBuilder;
import com.barclaysbank.rewards.resource.builder.Resource_BalanceRespBuilder;
import com.barclaysbank.rewards.resource.validator.ResourceRequestValidator;

@RestController
@RequestMapping("/pwpservice/balance")
//@Component
public class Resource_BalanceImpl{
	@Autowired
	Process_BalanceImpl processBalanceImpl;
	@Autowired
	ResourceRequestValidator resourceRequestValidator;
	@Autowired
	Resource_BalanceReqBuilder resourceBalanceReqBuilder;
	@Autowired
	Resource_BalanceRespBuilder resourceBalanceRespBuilder;


	@GetMapping(value="{cardNum}",produces={"application/json"})
	public Resource_BalanceResp getBalance(

			@PathVariable("cardNum") String cardNum,

			@RequestHeader("msgTs") String msgTs,

			@RequestHeader("clientId") String clientId,

			@RequestHeader("channelId") String channelId,

			@RequestHeader("correlationId") String correlationId,

			@RequestBody(required=false) Resource_CustomerContext custContext){



		/*
		 * public Resource_BalanceResp getBalance(String cardNum,String msgTs,String
		 * clientId ,String channelId,String correlationId,Resource_CustomerContext
		 * custContext){
		 */



		Resource_ClientContext clntContext = new Resource_ClientContext(msgTs, clientId, channelId, correlationId);
		Resource_StatusBlock stsBlc = new Resource_StatusBlock();
		try {
			resourceRequestValidator.validateRequest(clntContext,custContext);
		} catch (Exception e) {
			stsBlc.setErrorCode("4050");
			stsBlc.setErrorMsg("Invalid Request");
			e.printStackTrace();
			//throw new BadRequestException("4050","Invalid Request");
		}

		Process_BalanceResp processBalanceResp =  processBalanceImpl.getBalance(cardNum);
		if(processBalanceResp != null) {
			stsBlc.setRespCode("0");
			stsBlc.setRespMsg("Success");
		}
		else {
			stsBlc.setRespCode("75");
			stsBlc.setRespMsg("Fail");
		}

		Resource_BalanceResp balanceResp = resourceBalanceRespBuilder.build(processBalanceResp);
		balanceResp.setStatusBlock(stsBlc);
		return balanceResp;
	}


}

