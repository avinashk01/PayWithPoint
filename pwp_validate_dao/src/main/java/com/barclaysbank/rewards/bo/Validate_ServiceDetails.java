package com.barclaysbank.rewards.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SERVICE_DETAILS")
public class Validate_ServiceDetails {
	@Id
	@Column(name="SERVICE_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int serviceId;
	@Column(name="SERVICE_NAME")
	private String serviceName;
	@Column(name="API_NAME")
	private String apiName;
	@Column(name="VERSION")
	private String version;
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Validate_ServiceDetails [serviceId=");
		builder.append(serviceId);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", apiName=");
		builder.append(apiName);
		builder.append(", version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}
	

}
