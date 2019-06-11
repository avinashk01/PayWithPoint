package com.barclaysbank.rewards.process.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.barclaysbank.rewards.ProcessSpringBootApp;
import com.barclaysbank.rewards.balance.dao.entity.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.dao.impl.DAO_BalanceImpl;
import com.barclaysbank.rewards.process.beans.Process_BalanceResp;
import com.barclaysbank.rewards.process.builder.Process_BalanceRespBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {ProcessSpringBootApp.class})
public class Process_BalanceImplTest {
	@MockBean
	DAO_BalanceImpl daoBalanceImpl;
	@MockBean
	Process_BalanceRespBuilder processBalanceRespBuilder;
	@Autowired
	Process_BalanceImpl processBalanceImpl;
	
	private DAO_BalanceInfo daoBalanceInfo = new DAO_BalanceInfo(6,4587,698547,87455,3698745);
	private Process_BalanceResp processBalanceResp ;

	@Before
	public void setUp() throws Exception {
		when(daoBalanceImpl.getBalance(anyString())).thenReturn(daoBalanceInfo);
		when(processBalanceRespBuilder.build(any(DAO_BalanceInfo.class))).thenCallRealMethod();
	}

	
	@Test
	public void test() {
		processBalanceResp = processBalanceImpl.getBalance("52648799536");
		assertNotNull(processBalanceImpl);
		assertThat(processBalanceResp.getAvailablePts()).isEqualTo(3698745);
	}
	
	@After
	public void tearDown() throws Exception {
		daoBalanceInfo = null;
	}


}
