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
import com.learning.RestController.repository.QuotaTypeRepository;

@Service
public class QuotaTypeServiceImpl {
	
	@Autowired
	QuotaTypeRepository quotaTypeRepository;
	
	public Optional<QuotaType> getQuotatypeById(String id) {
		return quotaTypeRepository.findById(id);
	}
	
	public QuotaType saveQuota(QuotaType quota) {
		return quotaTypeRepository.save(quota);
	}
	
	public QuotaType findByQuotaTypeName(String name) {
		return quotaTypeRepository.findByQuotaType(name);
	}

}
