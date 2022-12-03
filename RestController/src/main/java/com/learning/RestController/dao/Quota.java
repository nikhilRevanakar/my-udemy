package com.learning.RestController.dao;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
@IdClass(CompositeKey.class)
public class Quota implements Serializable{
	private static final long serialVersionUID = 2L;
	
//	@Id
//	@OneToOne()
//	@JoinColumn(name="client_id")
//	private FspGroup clientId;
//	
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="quota_id", referencedColumnName = "type_id")
	private QuotaType quotaId;

	
	@Id
	private String clientId;
	
//	@Id
//	private QuotaType quotaId;
	
	private int currentCnt;
	
	private int subscribedCnt;
	
	private int isQuotaExceeded;
	
	
	
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public QuotaType getQuotaId() {
		return quotaId;
	}

	public void setQuotaId(QuotaType quotaId) {
		this.quotaId = quotaId;
	}

	public int getCurrentCnt() {
		return currentCnt;
	}

	public void setCurrentCnt(int currentCnt) {
		this.currentCnt = currentCnt;
	}

	public int getSubscribedCnt() {
		return subscribedCnt;
	}

	public void setSubscribedCnt(int subscribedCnt) {
		this.subscribedCnt = subscribedCnt;
	}

	public int getIsQuotaExceeded() {
		return isQuotaExceeded;
	}

	public void setIsQuotaExceeded(int isQuotaExceeded) {
		this.isQuotaExceeded = isQuotaExceeded;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
