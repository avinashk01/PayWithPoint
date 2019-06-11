package com.barclaysbank.rewards.balance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BalanceBootApplication {
	private final static Logger logger = LoggerFactory.getLogger(BalanceBootApplication.class);
	public static void main(String[] args) {
		logger.debug("Enter into SpringBootApplication from main()");
		SpringApplication.run(BalanceBootApplication.class, args);
		logger.debug("Exist from SpringBootApplication from main()");
		
	}
	


	
	
	
	
	
}
