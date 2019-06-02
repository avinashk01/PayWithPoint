package com.barclaysbank.rewards.balance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.balance.dao.bo.DAO_BalanceInfo;

@Repository
public interface BalanceJPARepository extends JpaRepository<DAO_BalanceInfo, String>{
	DAO_BalanceInfo findByCardNum(String cardNum);

}
