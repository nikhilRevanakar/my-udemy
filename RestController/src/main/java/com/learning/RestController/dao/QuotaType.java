package com.learning.RestController.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuotaType implements java.io.Serializable {
	
	@Id
	@Column(name ="type_id")
	private String typeId;
	
	private String quotaType;
	
	private String name;
	
	private String description;
	
	private String status;
	
	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getQuotaType() {
		return quotaType;
	}

	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
	
	
}
