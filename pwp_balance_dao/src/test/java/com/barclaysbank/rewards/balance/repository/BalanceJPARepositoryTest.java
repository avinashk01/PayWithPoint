package com.barclaysbank.rewards.balance.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.barclaysbank.rewards.balance.dao.entity.DAO_BalanceInfo;

@RunWith(SpringRunner.class)
@DataJpaTest()
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class BalanceJPARepositoryTest {
	@Autowired
	BalanceJPARepository balanceJPARepository;

	@Test
	public void test() {
		DAO_BalanceInfo daoBalanceInfo = balanceJPARepository.findByCardNum("5298000100265987");
		assertNotNull(daoBalanceInfo);
		assertThat(daoBalanceInfo.getAvailablePts()).isEqualTo(16025);
		
		
	}
	
	private DAO_BalanceInfo getDaoBalanceInfo() {
		DAO_BalanceInfo daoBalanceInfo = new DAO_BalanceInfo();
		daoBalanceInfo.setRewardId(52);
		daoBalanceInfo.setCardNum("5298000100214488");
		daoBalanceInfo.setAvailablePts(54080);
		daoBalanceInfo.setEarnedPts(10253);
		daoBalanceInfo.setPendingPts(1520);
		daoBalanceInfo.setUsedPts(254873);
		
		return daoBalanceInfo;
	}

}
