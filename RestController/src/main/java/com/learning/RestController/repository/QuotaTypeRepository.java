package com.learning.RestController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.RestController.dao.FspGroup;
import com.learning.RestController.dao.Quota;
import com.learning.RestController.dao.QuotaType;

@Repository
public interface QuotaTypeRepository extends JpaRepository<QuotaType, String> {
	
	QuotaType findByQuotaType(String name);

}
