package com.brunopieruzzi.apirest.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;
import lombok.Data;

@Document(value = "employee")
@Data
@Builder
public class Employee {

    @id
    private String id;
    private String name;
    private String surname;
    private int dni;

}
