package com.barclaysbank.rewards.resource.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.barclaysbank.rewards.process.beans.Process_BalanceResp;
import com.barclaysbank.rewards.process.impl.Process_BalanceImpl;
import com.barclaysbank.rewards.resource.beans.Resource_CardDetails;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_ServiceDtls;
import com.barclaysbank.rewards.resource.builder.Resource_BalanceRespBuilder;
import com.barclaysbank.rewards.resource.validator.ResourceRequestValidator;

//@RunWith(SpringRunner.class)
//@WebMvcTest(value=Resource_BalanceController.class,secure=false)
public class Resource_BalanceControllerTest {
	/*
	 * @MockBean Process_BalanceImpl processBalanceImpl;
	 * 
	 * @MockBean ResourceRequestValidator resourceRequestValidator;
	 * 
	 * @MockBean Resource_BalanceRespBuilder resourceBalanceRespBuilder;
	 * 
	 * @Autowired private MockMvc mockMvc;
	 * 
	 * 
	 * @Before public void setUp() throws Exception {
	 * when(processBalanceImpl.getBalance(anyString())).thenReturn(
	 * getProcessBalanceResp());
	 * when(resourceRequestValidator.validateRequest(anyString(),any(
	 * Resource_ClientContext.class), any(Resource_ServiceDtls.class),
	 * any(Resource_CardDetails.class))).thenReturn(false);
	 * when(resourceBalanceRespBuilder.build(any(Process_BalanceResp.class))).
	 * thenCallRealMethod(); }
	 * 
	 * 
	 * @Test public void test() throws Exception { String expected =
	 * "{'balInfo':{'usedPts':968574,'earnedPts':65478,'pendingPts':154879,'availablePts':14578},'statusBlock':{'respCode':'0','respMsg':'Success','errorCode':null,'errorMsg':null}}";
	 * HttpHeaders httpHeaders = new HttpHeaders(); httpHeaders.set("msgTs",
	 * "2019-06-09 11:00"); httpHeaders.set("clientId", "1");
	 * httpHeaders.set("channelId", "1"); httpHeaders.set("correlationId", "586");
	 * httpHeaders.set("svcName", "pwpservice"); httpHeaders.set("apiName",
	 * "getbalanceapi"); httpHeaders.set("version", "v1"); httpHeaders.set("cvvNum",
	 * "895"); httpHeaders.set("expDate", "2022-02-05");
	 * httpHeaders.set("nameOnCard", "Denial"); RequestBuilder requestBuilder =
	 * MockMvcRequestBuilders.get("/pwpservice/balance/5298000100265987").headers(
	 * httpHeaders); MvcResult mvcResult =
	 * mockMvc.perform(requestBuilder).andReturn();
	 * System.out.println("RESPONSE DATA : "+mvcResult.getResponse().
	 * getContentAsString()); JSONAssert.assertEquals(expected,
	 * mvcResult.getResponse().getContentAsString(), true); }
	 * 
	 * @After public void tearDown() throws Exception { }
	 * 
	 * private Process_BalanceResp getProcessBalanceResp() { Process_BalanceResp
	 * processBalanceResp = new Process_BalanceResp();
	 * processBalanceResp.setAvailablePts(14578);
	 * processBalanceResp.setEarnedPts(65478);
	 * processBalanceResp.setPendingPts(154879);
	 * processBalanceResp.setUsedPts(968574);
	 * 
	 * return processBalanceResp; }
	 * 
	 * 
	 */	

}
