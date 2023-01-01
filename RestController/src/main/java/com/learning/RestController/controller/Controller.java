package com.learning.RestController.controller;

import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learning.RestController.Impl.FspGroupServiceImpl;

import com.learning.RestController.Impl.QuotaServiceImpl;
import com.learning.RestController.Impl.QuotaTypeServiceImpl;
import com.learning.RestController.dao.FspGroup;
import com.learning.RestController.dao.Quota;
import com.learning.RestController.dao.QuotaType;
import com.learning.RestController.repository.FspGroupRepository;
import com.learning.RestController.repository.QuotaRepository;
import com.learning.RestController.repository.QuotaTypeRepository;

@RestController
@Transactional	
public class Controller {
	
	@Autowired
	FspGroupServiceImpl fspGroupServiceImpl;
	
	@Autowired
	QuotaServiceImpl quotaServiceImpl;
	
	@Autowired
	QuotaTypeServiceImpl quotaTypeServiceImpl;
	
	@GetMapping("/")
	public String getDemo() {
		return "Hello";
	}
	
	@GetMapping("/restTemplate")
	public Quota restTemplateExample() {
		String uri = "http://localhost:8390/quota/group-1/type-1";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Quota> forEntity = restTemplate.getForEntity(uri, Quota.class);
		System.out.println(forEntity.getBody());
		
		return forEntity.getBody();
	}
	
	
	@PostMapping("/fspgroup")
	public FspGroup saveGroup(@RequestBody FspGroup group) {
		
		FspGroup saveGroup = fspGroupServiceImpl.saveGroup(group);
		Quota quota = new Quota();
		quota.setCurrentCnt(group.getCc());
		quota.setSubscribedCnt(group.getSc());
		quota.setIsQuotaExceeded(group.getExceeded());
		quota.setClientId(saveGroup.getId());
		
		QuotaType findByQuotaTypeName = quotaTypeServiceImpl.findByQuotaTypeName(group.getQuotaType());
		
		quota.setQuotaId(findByQuotaTypeName);
		
		quotaServiceImpl.saveQuota(quota);
		
		return saveGroup;
	}
	
	@PostMapping("/quotaType")
	public QuotaType saveQuotaType(@RequestBody QuotaType quotaType) {
		return quotaTypeServiceImpl.saveQuota(quotaType);
	}
	
	@PostMapping("/quota")
	public Quota saveQuota(@RequestBody Quota quota) {
		//Optional<FspGroup> groupById = fspGroupServiceImpl.getGroupById(quota.getClientId());
		return quotaServiceImpl.saveQuota(quota);
	}
	
	@GetMapping("/quota/{quid}/{typeId}")
	public Optional<Quota> getQuota(@PathVariable String quid, @PathVariable String typeId) {
		
		QuotaType findByQuotaTypeName = quotaTypeServiceImpl.getQuotatypeById(typeId).get();
		return quotaServiceImpl.getQuotaById(quid, findByQuotaTypeName.getTypeId());
	}
		

	
}
