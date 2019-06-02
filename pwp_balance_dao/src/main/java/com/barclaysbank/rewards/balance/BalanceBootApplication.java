package com.barclaysbank.rewards.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barclaysbank.rewards.balance.dao.bo.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.dao.impl.DAO_BalanceImpl;

@SpringBootApplication
public class BalanceBootApplication implements CommandLineRunner{
	
	@Autowired
	DAO_BalanceImpl balanceDao;
	
	public static void main(String[] args) {
		SpringApplication.run(BalanceBootApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		//DAO_BalanceInfo balResp = balanceDao.getBalance("529800010029631");
		//System.out.println(balResp);
		
	}
	

	
	
	
	
	
	
	
	
	
	
}
