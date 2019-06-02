package com.barclaysbank.rewards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barclaysbank.rewards.repository.CardDetailsJPARepository;
import com.barclaysbank.rewards.repository.ClientChannelJPARepository;
import com.barclaysbank.rewards.repository.ServiceDetailsJPARepository;

@SpringBootApplication
public class PwpValidateDaoApplication implements CommandLineRunner{
	
	@Autowired
	CardDetailsJPARepository cardRepository;
	@Autowired
	ClientChannelJPARepository clntchnlRepository;
	@Autowired
	ServiceDetailsJPARepository svcDtlsRepository;

	public static void main(String[] args) {
		SpringApplication.run(PwpValidateDaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(cardRepository.findByCardNum("5298000100287456"));
		//System.out.println(clntchnlRepository.findByClientId("1"));
		//System.out.println(svcDtlsRepository.findByApiName("getbalanceapi"));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
