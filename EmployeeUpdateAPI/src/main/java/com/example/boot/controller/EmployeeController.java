package com.example.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.dao.EmployeeDAO;
import com.example.boot.entity.EmployeeEntity;
import com.example.boot.entity.EmployeeEntityResp;
import com.example.boot.status.StatusBlock;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	@Autowired
	EmployeeDAO empDao;
	@PostMapping(value = "/add/emp", produces = {"application/json","application/xml"},consumes = {"application/json","application/xml"})
	public StatusBlock addEmployee(@RequestHeader("clientId") String clientId,@RequestHeader("channelId") String channelId, @RequestBody EmployeeEntity empEntity) {
		EmployeeEntity respEntity = empDao.saveEmployee(empEntity);
		StatusBlock stsBlc = new StatusBlock();
		if(respEntity != null) {
			stsBlc.setRepsCode("0");
			stsBlc.setRespMsg("Success");
			stsBlc.setClientId(clientId);
			stsBlc.setChannelId(channelId);
		}
		else {
			stsBlc.setRepsCode("78");
			stsBlc.setRespMsg("Fail");
		}
		return stsBlc;
	}
	
	@GetMapping(value="/getAll/emp", produces = {"application/json","application/xml"})
	public EmployeeEntityResp getAllEmpDtls(@RequestHeader("clientId") String clientId,@RequestHeader("channelId") String channelId){
		List<EmployeeEntity> respEntityList = empDao.getAllEmployeeDetails();
		EmployeeEntityResp resp = new EmployeeEntityResp();
		StatusBlock stsBlc = new StatusBlock();
		if(respEntityList != null) {
			stsBlc.setRepsCode("0");
			stsBlc.setRespMsg("Success");
			stsBlc.setClientId(clientId);
			stsBlc.setChannelId(channelId);
		}
		else {
			stsBlc.setRepsCode("78");
			stsBlc.setRespMsg("Fail");
		}
		resp.setEmpList(respEntityList);
		resp.setStsBlc(stsBlc);
		
		return resp;
		
	}

}
