package com.train.hibernateinheritance.entity.mappedsuperclass;

import javax.persistence.Entity;

@SuppressWarnings("ALL")
@Entity
public class Manager extends Person{
    private String grade;

    public Manager(Long personId, String name, String grade) {
        super(personId, name);
        this.grade = grade;
    }

    public Manager(){}

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
