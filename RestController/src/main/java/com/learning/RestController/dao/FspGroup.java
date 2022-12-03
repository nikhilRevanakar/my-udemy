package com.learning.RestController.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class FspGroup {
	
	@Id
	private String id;
	
	private String name;
	
	private String email;
	
	private transient int cc;
	
	private transient int sc;

	private transient int exceeded;
	
	private transient String quotaType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getSc() {
		return sc;
	}

	public void setSc(int sc) {
		this.sc = sc;
	}

	public int getExceeded() {
		return exceeded;
	}

	public void setExceeded(int exceeded) {
		this.exceeded = exceeded;
	}

	public String getQuotaType() {
		return quotaType;
	}

	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}



//	public Quota getQuota() {
//		return quota;
//	}
//
//	public void setQuota(Quota quota) {
//		this.quota = quota;
//	}
//	
	
	
	
}
