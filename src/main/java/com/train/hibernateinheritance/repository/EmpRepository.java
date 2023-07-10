package com.train.hibernateinheritance.repository;

import com.train.hibernateinheritance.entity.mappedsuperclass.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Long> {
}
