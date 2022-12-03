package com.learning.RestController.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.RestController.dao.CompositeKey;
import com.learning.RestController.dao.FspGroup;

import com.learning.RestController.dao.Quota;
import com.learning.RestController.dao.QuotaType;
import com.learning.RestController.repository.FspGroupRepository;
import com.learning.RestController.repository.QuotaRepository;

@Service
public class QuotaServiceImpl {
	
	@Autowired
	QuotaRepository quotaRepository;
	
	public Optional<Quota> getQuotaById(String clientId, String typeId) {
		CompositeKey compositeKey = new CompositeKey(clientId, typeId);
		return quotaRepository.findById(compositeKey);
	}
	
	public Quota saveQuota(Quota quota) {
		return quotaRepository.save(quota);
	}
	
	
	public Iterable<Quota> findAll() {
		return quotaRepository.findAll();
	}
	

}
