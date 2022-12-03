package com.learning.RestController.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.RestController.dao.FspGroup;

@Repository
public interface FspGroupRepository extends CrudRepository<FspGroup, String> {

}
