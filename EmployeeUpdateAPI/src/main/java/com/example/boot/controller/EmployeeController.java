package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.dao.EmployeeDAO;
import com.example.boot.entity.EmployeeEntity;
import com.example.boot.status.StatusBlock;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeDAO empDao;
	@PostMapping(value = "/add/employee", produces = {"application/json","application/xml"},consumes = {"application/json","application/xml"})
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

}
