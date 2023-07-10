package com.train.hibernateinheritance.service;

import com.train.hibernateinheritance.entity.mappedsuperclass.Employee;
import com.train.hibernateinheritance.repository.EmpRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmpRepository repository;

    public EmployeeService(EmpRepository repository) {
        this.repository = repository;
        this.repository.save(new Employee(1L,"Ali","Behsa"));
        this.repository.save(new Employee(2L,"Hossein","Behsa"));
        this.repository.save(new Employee(3L,"Saeid","Behsa"));
    }

    public List<Employee> findAllEmployees(){
        return repository.findAll();
    }
}
