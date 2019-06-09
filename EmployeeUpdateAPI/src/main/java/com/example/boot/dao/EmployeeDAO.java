package com.example.boot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.boot.entity.EmployeeEntity;
import com.example.boot.repository.EmployeeJPARepository;

@Repository
public class EmployeeDAO {
	
	@Autowired
	EmployeeJPARepository employeeJPARepository;
	
	public EmployeeEntity saveEmployee(EmployeeEntity empEntity) {
		EmployeeEntity res = employeeJPARepository.save(empEntity);
		return res;
	}
	
	public List<EmployeeEntity> getAllEmployeeDetails(){
		return employeeJPARepository.findAll();
	}
	

}
