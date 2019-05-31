package com.barclaysbank.rewards.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barclaysbank.rewards.balance.dao.DAO_Balance_I;
import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceReq;
import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceResp;

@SpringBootApplication
public class BalanceBootApplication implements CommandLineRunner{
	
	@Autowired
	DAO_Balance_I balanceDao;
	public static void main(String[] args) {
		SpringApplication.run(BalanceBootApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		DAO_BalanceReq balanceRequest = new DAO_BalanceReq();
		balanceRequest.setCardNum("5298000100296314");
		DAO_BalanceResp balResp = balanceDao.getBalance(balanceRequest);
		System.out.println(balResp);
		
	}
	

}
