package com.barclaysbank.rewards.redeem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;

public interface RedeemJPARepository extends JpaRepository<DAO_RedeemProductInfo, Integer>{
	List<DAO_RedeemProductInfo> findByCardNum(String cardNum);

}
