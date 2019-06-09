package com.barclaysbank.rewards.resource.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.barclaysbank.rewards.process.beans.Process_RedeemInfo;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;
import com.barclaysbank.rewards.process.impl.Process_RedeemImpl;
import com.barclaysbank.rewards.resource.beans.Resource_CardDetails;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_ServiceDtls;
import com.barclaysbank.rewards.resource.builder.Resource_RedeemRespBuilder;
import com.barclaysbank.rewards.resource.validator.ResourceRequestValidator;

@RunWith(SpringRunner.class)
@WebMvcTest(value=Resource_ProductController.class, secure=false)
public class Resource_RedeemControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	Process_RedeemImpl processRedeemImpl;
	@MockBean
	ResourceRequestValidator resourceRequestValidator;
	@MockBean
	Resource_RedeemRespBuilder resourceRedeemRespBuilder;

	@Before
	public void setUp() throws Exception {
		when(processRedeemImpl.getRedeem(anyString())).thenReturn(getProcessRedeemResp());
		when(resourceRequestValidator.validateRequest(anyString(), any(Resource_ClientContext.class), any(Resource_ServiceDtls.class), any(Resource_CardDetails.class))).thenReturn(true);
		when(resourceRedeemRespBuilder.build(any(Process_RedeemResp.class))).thenCallRealMethod();
	}

	@Test
	public void test() throws Exception {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("msgTs", "2019-06-09 11:00");
		httpHeaders.set("clientId", "1");
		httpHeaders.set("channelId", "1");
		httpHeaders.set("correlationId", "586");
		httpHeaders.set("svcName", "pwpservice");
		httpHeaders.set("apiName", "redeemptionapi");
		httpHeaders.set("version", "v1");
		httpHeaders.set("cvvNum", "895");
		httpHeaders.set("expDate", "2022-02-05");
		httpHeaders.set("nameOnCard", "Denial");
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/pwpservice/balance/5298000100265987").headers(httpHeaders);
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		System.out.println("RESPONSE DATA : "+mvcResult.getResponse().getContentAsString());
		JSONAssert.assertEquals("", mvcResult.getResponse().getContentAsString(), true);

	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	private Process_RedeemResp getProcessRedeemResp(){
		Process_RedeemResp processRedeemResp = new Process_RedeemResp();
		List<Process_RedeemInfo> processRedeemInfoList = new ArrayList<Process_RedeemInfo>();
		Process_RedeemInfo processRedeemInfo = new Process_RedeemInfo();
		processRedeemInfo.setDeliveryDate(new Date(2019-07-06));
		processRedeemInfo.setOrderId(1);
		processRedeemInfo.setPrice(300);
		processRedeemInfo.setProductName("Mouse");
		processRedeemInfo.setPurchaseDate(new Date(2019-06-06));
		
		processRedeemInfoList.add(processRedeemInfo);
		
		processRedeemInfo = new Process_RedeemInfo();
		processRedeemInfo.setDeliveryDate(new Date(2019-03-26));
		processRedeemInfo.setOrderId(2);
		processRedeemInfo.setPrice(500);
		processRedeemInfo.setProductName("Keybord");
		processRedeemInfo.setPurchaseDate(new Date(2019-05-22));
		
		processRedeemInfoList.add(processRedeemInfo);
		
		processRedeemResp.setRedeemInfoList(processRedeemInfoList);
		return processRedeemResp;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
