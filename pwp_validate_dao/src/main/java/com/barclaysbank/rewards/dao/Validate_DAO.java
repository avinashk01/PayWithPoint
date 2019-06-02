package com.barclaysbank.rewards.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.bo.Validate_CardDetails;
import com.barclaysbank.rewards.bo.Validate_ClientContext;
import com.barclaysbank.rewards.bo.Validate_ServiceDetails;
import com.barclaysbank.rewards.repository.CardDetailsJPARepository;
import com.barclaysbank.rewards.repository.ClientChannelJPARepository;
import com.barclaysbank.rewards.repository.ServiceDetailsJPARepository;

@Component
public class Validate_DAO {
	@Autowired
	CardDetailsJPARepository cardRepository;
	@Autowired
	ClientChannelJPARepository clntchnlRepository;
	@Autowired
	ServiceDetailsJPARepository svcDtlsRepository;
	
	public Validate_CardDetails getCardDetails(String cardNum) {
		return cardRepository.findByCardNum(cardNum);
	}
	
	public Validate_ClientContext getClientChannelId(String clientId) {
		return clntchnlRepository.findByClientId(clientId);
	}
	
	public Validate_ServiceDetails getServiceDetails(String apiName) {
		return svcDtlsRepository.findByApiName(apiName);
	}

}
