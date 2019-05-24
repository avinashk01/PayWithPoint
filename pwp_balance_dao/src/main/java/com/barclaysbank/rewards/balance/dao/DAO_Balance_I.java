package com.barclaysbank.rewards.balance.dao;

import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceReq;
import com.barclaysbank.rewards.balance.dao.beans.DAO_BalanceResp;

@Repository("dao_bal_i")
public interface DAO_Balance_I {
	DAO_BalanceResp getBalance(DAO_BalanceReq req);

}
