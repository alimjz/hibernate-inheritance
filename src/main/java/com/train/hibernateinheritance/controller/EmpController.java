package com.train.hibernateinheritance.controller;

import com.train.hibernateinheritance.entity.mappedsuperclass.Employee;
import com.train.hibernateinheritance.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmpController {
    private final EmployeeService service;

    public EmpController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> findAllEmployees(){
        return service.findAllEmployees();
    }
}
