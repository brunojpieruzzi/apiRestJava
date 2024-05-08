package com.brunopieruzzi.apirest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunopieruzzi.apirest.Dto.EmployeeDto;
import com.brunopieruzzi.apirest.Model.Employee;
import com.brunopieruzzi.apirest.Repositories.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee (EmployeeDto employeeDto){
        try {
            Employee emp = Employee.builder()
                            .name(employeeDto.getName())
                            .surname(employeeDto.getSurname())
                            .dni(employeeDto.getDni())
                            .build();
            employeeRepository.save(emp);        
        } catch (Exception e) {
            // TODO: handle exception
        }
        return"empleado creado con exito";
    }

}
