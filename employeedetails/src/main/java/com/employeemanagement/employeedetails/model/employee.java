package com.employeemanagement.employeedetails.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "empdetails")
public class employee {
@Id
private String id;
private String name;
private String email;
private String city;
}
