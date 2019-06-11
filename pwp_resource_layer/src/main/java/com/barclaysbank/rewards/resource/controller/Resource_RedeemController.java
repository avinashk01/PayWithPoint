package com.barclaysbank.rewards.resource.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclaysbank.rewards.exception.BadRequestException;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;
import com.barclaysbank.rewards.process.impl.Process_RedeemImpl;
import com.barclaysbank.rewards.resource.beans.Resource_CardDetails;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_RedeemResp;
import com.barclaysbank.rewards.resource.beans.Resource_ServiceDtls;
import com.barclaysbank.rewards.resource.beans.Resource_StatusBlock;
import com.barclaysbank.rewards.resource.builder.Resource_RedeemRespBuilder;
import com.barclaysbank.rewards.resource.validator.ResourceRequestValidator;

@RestController
@RequestMapping("/pwpservice/redeem")
public class Resource_RedeemController{
	private final static Logger logger = LoggerFactory.getLogger(Resource_RedeemController.class);
	
	@Autowired
	Process_RedeemImpl processRedeemImpl;
	@Autowired
	ResourceRequestValidator resourceRequestValidator;
	@Autowired
	Resource_RedeemRespBuilder resourceRedeemRespBuilder;

	@GetMapping(value="{cardNum}",produces={"application/json"})
	public Resource_RedeemResp getRedeem(
			@PathVariable("cardNum") String cardNum,
			@RequestHeader("msgTs") String msgTs,
			@RequestHeader("clientId") String clientId,
			@RequestHeader("channelId") String channelId,
			@RequestHeader("correlationId") String correlationId,
			@RequestHeader("svcName") String svcName ,
			@RequestHeader("apiName") String apiName,
			@RequestHeader("version") String version,
			@RequestHeader("cvvNum") String cvvNum,
			@RequestHeader("expDate") String expDate,
			@RequestHeader("nameOnCard") String nameOnCard) {
		
		logger.info("#### Enter into getRedeem()  ####");

		Resource_ServiceDtls svcDtls = new Resource_ServiceDtls(svcName,apiName,version);
		Resource_CardDetails cardDtls = new Resource_CardDetails(cvvNum,expDate,nameOnCard);
		Resource_ClientContext clntContext = new Resource_ClientContext(msgTs, clientId, channelId, correlationId);

		Resource_StatusBlock stsBlc = new Resource_StatusBlock();
		try {
			resourceRequestValidator.validateRequest(cardNum,clntContext, svcDtls,cardDtls);
		} catch (Exception e) {
			logger.error("#### Fail to validate the requested data ####");
			stsBlc.setErrorCode("4050");
			stsBlc.setErrorMsg("Invalid Request");
			throw new BadRequestException("4050",e.toString());
		}

		Process_RedeemResp processRedeemResp = processRedeemImpl.getRedeem(cardNum);
		//System.out.println(processRedeemResp);
		Resource_RedeemResp resourceRedeemResp = resourceRedeemRespBuilder.build(processRedeemResp);
		System.out.println(resourceRedeemResp);
		if(resourceRedeemResp != null) {
			stsBlc.setRespCode("0");
			stsBlc.setRespMsg("Success");
		}
		else {
			stsBlc.setRespCode("98");
			stsBlc.setRespMsg("Fail");
		}

		resourceRedeemResp.setStatusBlock(stsBlc);
		logger.info("#### Exit from getRedeem()  #### Resource_ProductResp : "+resourceRedeemResp+" ####");
		return resourceRedeemResp;

	}


}
