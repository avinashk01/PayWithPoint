package com.example.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMP_ID")
	private int empId;
	@Column(name="NAME")
	private String name;
	@Column(name="SALARY")
	private double salary;
	@Column(name="ADDRESS")
	private String address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeEntity [empId=");
		builder.append(empId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	

}
