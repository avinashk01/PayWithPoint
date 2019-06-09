package com.example.boot.entity;

import java.util.List;

import com.example.boot.status.StatusBlock;

public class EmployeeEntityResp {
	private List<EmployeeEntity> empList;
	private StatusBlock stsBlc;
	public List<EmployeeEntity> getEmpList() {
		return empList;
	}
	public void setEmpList(List<EmployeeEntity> empList) {
		this.empList = empList;
	}
	public StatusBlock getStsBlc() {
		return stsBlc;
	}
	public void setStsBlc(StatusBlock stsBlc) {
		this.stsBlc = stsBlc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeEntityResp [empList=");
		builder.append(empList);
		builder.append(", stsBlc=");
		builder.append(stsBlc);
		builder.append("]");
		return builder.toString();
	}
	

}
