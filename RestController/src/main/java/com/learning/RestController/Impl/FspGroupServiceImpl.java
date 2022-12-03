package com.learning.RestController.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.RestController.dao.FspGroup;
import com.learning.RestController.repository.FspGroupRepository;

@Service
public class FspGroupServiceImpl {
	
	@Autowired
	FspGroupRepository fspGroupRepository;
	
	public Optional<FspGroup> getGroupById(String id) {
		return fspGroupRepository.findById(id);
	}
	
	public FspGroup saveGroup(FspGroup fspGroup) {
		return fspGroupRepository.save(fspGroup);
	}

}
