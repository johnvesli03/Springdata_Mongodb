package com.employeemanagement.employeedetails.service;

import com.employeemanagement.employeedetails.model.employee;
import com.employeemanagement.employeedetails.repository.empRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class employeeservice {
@Autowired
    private empRepository empRepository;
public List<employee> getallemployees(){
    return empRepository.findAll();
    }
public Optional<employee> getemployeebyid(String id){
    return empRepository.findById(id);
}
public employee addemployee(employee employee){
    return empRepository.save(employee);
}
}
