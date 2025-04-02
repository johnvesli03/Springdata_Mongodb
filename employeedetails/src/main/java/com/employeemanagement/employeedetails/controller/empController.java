package com.employeemanagement.employeedetails.controller;

import com.employeemanagement.employeedetails.model.employee;
import com.employeemanagement.employeedetails.service.employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class empController {
@Autowired
    private employeeservice employeeservice;

@GetMapping("/displayemployees")
    public List<employee> getallemployees(){
    return employeeservice.getallemployees();
}
@GetMapping("/display/{id}")
    public Optional<employee> getemployeebyid(@PathVariable String id){
    return employeeservice.getemployeebyid(id);
}
@PostMapping("/addemp")
    public employee addemployee(@RequestBody employee employee){
    return employeeservice.addemployee(employee);
}
}
