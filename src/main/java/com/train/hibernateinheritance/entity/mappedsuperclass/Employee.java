package com.train.hibernateinheritance.entity.mappedsuperclass;

import javax.persistence.Entity;

@SuppressWarnings("ALL")
@Entity
public class Employee extends Person{
    private String company;

    public Employee(Long personId, String name, String company) {
        super(personId,name);
        this.company = company;
    }

    public Employee() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
