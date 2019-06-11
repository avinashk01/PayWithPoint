package com.barclaysbank.rewards.balance.dao.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.barclaysbank.rewards.balance.BalanceBootApplication;
import com.barclaysbank.rewards.balance.dao.entity.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.repository.BalanceJPARepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {BalanceBootApplication.class})
public class DAO_BalanceImplTest {
	
	@Autowired
	DAO_BalanceImpl daoBalanceImpl;
	@MockBean
	BalanceJPARepository balanceJPARepository;

	@Before
	public void setUp() throws Exception {
		when(balanceJPARepository.findByCardNum(anyString())).thenReturn(new DAO_BalanceInfo(5,1200,2500,65423,98745));
	}

	@Test
	public void test() {
		DAO_BalanceInfo daoBalanceInfo = daoBalanceImpl.getBalance("5126845566566");
		assertNotNull(daoBalanceInfo);
		assertThat(daoBalanceInfo.getAvailablePts()).isEqualTo(98745);
	}

	
	
	

	
	
}
