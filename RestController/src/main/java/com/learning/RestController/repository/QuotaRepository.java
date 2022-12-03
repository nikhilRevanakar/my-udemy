package com.learning.RestController.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.RestController.dao.CompositeKey;
import com.learning.RestController.dao.FspGroup;
import com.learning.RestController.dao.Quota;

@Repository
public interface QuotaRepository extends CrudRepository<Quota, CompositeKey> {

}
