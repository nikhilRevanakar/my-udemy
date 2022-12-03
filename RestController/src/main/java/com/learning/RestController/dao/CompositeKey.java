package com.learning.RestController.dao;
import java.io.Serializable;

public class CompositeKey implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
//	private FspGroup clientId;
//	
//	private QuotaType quotaId;
	
	private String clientId;
	
	private String quotaId;
	
	

	public CompositeKey() {
		super();
	}

	public CompositeKey(String group, String quotaType) {
		super();
		this.clientId = group;
		this.quotaId = quotaType;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getQuotaId() {
		return quotaId;
	}

	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((quotaId == null) ? 0 : quotaId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeKey other = (CompositeKey) obj;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (quotaId == null) {
			if (other.quotaId != null)
				return false;
		} else if (!quotaId.equals(other.quotaId))
			return false;
		return true;
	}


	

}