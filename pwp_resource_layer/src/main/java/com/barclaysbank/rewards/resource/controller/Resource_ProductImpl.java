package com.barclaysbank.rewards.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclaysbank.rewards.exception.BadRequestException;
import com.barclaysbank.rewards.process.beans.Process_ProductResp;
import com.barclaysbank.rewards.process.impl.Process_BalanceImpl;
import com.barclaysbank.rewards.process.impl.Process_ProductImpl;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;
import com.barclaysbank.rewards.resource.beans.Resource_ProductResp;
import com.barclaysbank.rewards.resource.beans.Resource_StatusBlock;
import com.barclaysbank.rewards.resource.builder.Resource_ProductReqBuilder;
import com.barclaysbank.rewards.resource.builder.Resource_ProductRespBuilder;
import com.barclaysbank.rewards.resource.validator.ResourceRequestValidator;

@RestController
@RequestMapping("/pwpservice/product")
public class Resource_ProductImpl{
	
	@Autowired
	Process_ProductImpl processProductImpl;
	@Autowired
	Process_BalanceImpl processBalanceImpl;
	@Autowired
	ResourceRequestValidator resourceRequestValidator;
	@Autowired
	Resource_ProductReqBuilder resourceProductReqBuilder;
	@Autowired
	Resource_ProductRespBuilder resourceProductRespBuilder;
	
	@GetMapping(value="{cardNum}",produces={"application/json"})
	public Resource_ProductResp getProduct(
			@PathVariable("cardNum") String cardNum,
			@RequestHeader("msgTs") String msgTs,
			@RequestHeader("clientId") String clientId,
			@RequestHeader("channelId") String channelId,
			@RequestHeader("correlationId") String correlationId,
			@RequestBody Resource_CustomerContext custContext) {
		
		Resource_ClientContext clntContext = new Resource_ClientContext(msgTs, clientId, channelId, correlationId);
		
		Resource_StatusBlock stsBlc = new Resource_StatusBlock();
		try {
			resourceRequestValidator.validateRequest(cardNum,clntContext, custContext);
		} catch (Exception e) {
			stsBlc.setErrorCode("4050");
			stsBlc.setErrorMsg("Invalid Request");
			throw new BadRequestException("4050","Invalid Request");
		}
		
		long price = processBalanceImpl.getBalance(cardNum).getAvailablePts();
		Process_ProductResp processProductResp = processProductImpl.getProduct(price);
		
		if(processProductResp != null) {
			stsBlc.setRespCode("0");
			stsBlc.setRespMsg("Success");
		}
		else {
			stsBlc.setRespCode("74");
			stsBlc.setRespMsg("Fail");
		}
		Resource_ProductResp resourceProductResp = resourceProductRespBuilder.build(processProductResp);
		resourceProductResp.setStatusBlock(stsBlc);
		
		return resourceProductResp;
	}



	
	
	
	
	
	
	
	
}
