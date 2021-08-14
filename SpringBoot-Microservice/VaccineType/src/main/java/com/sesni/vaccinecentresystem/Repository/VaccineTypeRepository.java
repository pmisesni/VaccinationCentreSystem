package com.sesni.vaccinecentresystem.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sesni.vaccinecentresystem.model.VaccineType;

@Repository
public interface VaccineTypeRepository extends MongoRepository<VaccineType,Integer>{
	
}
