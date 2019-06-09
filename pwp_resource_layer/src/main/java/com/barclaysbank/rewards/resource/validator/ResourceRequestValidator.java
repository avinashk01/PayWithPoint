package com.barclaysbank.rewards.resource.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.bo.Validate_CardDetails;
import com.barclaysbank.rewards.bo.Validate_ClientContext;
import com.barclaysbank.rewards.bo.Validate_ServiceDetails;
import com.barclaysbank.rewards.dao.Validate_DAO;
import com.barclaysbank.rewards.exception.BadRequestException;
import com.barclaysbank.rewards.exception.CustomValidationException;
import com.barclaysbank.rewards.resource.beans.Resource_CardDetails;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_ServiceDtls;

@Component
public class ResourceRequestValidator {
	public boolean validateRequest(String cardNum,Resource_ClientContext clntContext,Resource_ServiceDtls svcDtls,Resource_CardDetails cardDtls) throws ParseException {
		ClientContextValidate(clntContext);
		serviceDetailsValidate(svcDtls);
		cardDetailsValidate(cardNum,cardDtls);
		return true;
	}

	@Autowired
	Validate_DAO dao;
	// validating client request
	private void ClientContextValidate(Resource_ClientContext clntContext) {
		Validate_ClientContext valClntContext = dao.getClientChannelId(clntContext.getClientId());

		if(!(clntContext.getClientId().equals(valClntContext.getClientId()))) {
			throw new CustomValidationException("4007", "Wrong Client Id");
		}
		if(!(clntContext.getChannelId().equals(valClntContext.getChannelId()))) {
			throw new CustomValidationException("4008", "Wrong Channel Id");
		}

		if(clntContext.getCorrelationId().trim().equals("") && clntContext.getCorrelationId() == null) {
			throw new CustomValidationException("4009", "Wrong Correlation Id");
		}
	}

	// validating card details
	private void cardDetailsValidate(String cardNum,Resource_CardDetails cardDtls) throws ParseException {
		Validate_CardDetails valCardDtls = dao.getCardDetails(cardNum);

		if(!(cardNum.equals(valCardDtls.getCardNum()))) {
			throw new CustomValidationException("4010", "Wrong Card number");
		}
		if(!(cardDtls.getCvvNum().equals(valCardDtls.getCvvNum()))) {
			throw new CustomValidationException("4011", "Wrong CVV number");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//eliminating time from date comming from database
		Date expDate1 = valCardDtls.getExpDate();
		expDate1 = sdf.parse(sdf.format(expDate1));
		// converting string date in java date in specified pattern
		Date expDate2 = sdf.parse(cardDtls.getExpDate());
		if(expDate1.compareTo(expDate2) != 0) {
			throw new CustomValidationException("4012", "Wrong Expiry date");
		}
		if(!(cardDtls.getNameOnCard().equals(cardDtls.getNameOnCard()))) {
			throw new CustomValidationException("4013", "Wrong NameOncard");
		}

	}

	// validating service details
	private void serviceDetailsValidate(Resource_ServiceDtls svcDtls) {
		Validate_ServiceDetails vSvcDtls = dao.getServiceDetails(svcDtls.getApiName());
		if(!(svcDtls.getApiName().equals(vSvcDtls.getApiName()))) {
			throw new BadRequestException("4001", "Wrong ApiName");
		}
		if(!(svcDtls.getVersion().equals(vSvcDtls.getVersion()))) {
			throw new BadRequestException("4002", "Wrong Version");
		}
		if(!(svcDtls.getSvcName().equals(vSvcDtls.getServiceName()))) {
			throw new CustomValidationException("4014", "Wrong Service Name");
		}
	}









}
