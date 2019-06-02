package com.barclaysbank.rewards.redeem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;
import com.barclaysbank.rewards.redeem.dao.impl.DAO_RedeemImpl;

@SpringBootApplication
public class RedeemSpringBootApplication implements CommandLineRunner{
	@Autowired
	DAO_RedeemImpl dao;
	
	public static void main(String[] args) {
		SpringApplication.run(RedeemSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//List<DAO_RedeemProductInfo> redeemProductInfo = dao.getProduct("5298000100265987");
		//System.out.println(redeemProductInfo);
		
	}
	
	
	
	
	
	
	
	

}
