package com.employeemanagement.employeedetails.repository;

import com.employeemanagement.employeedetails.model.employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empRepository extends MongoRepository <employee,String>{
}
