package com.brunopieruzzi.apirest.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brunopieruzzi.apirest.Model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

}
