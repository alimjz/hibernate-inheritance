package com.train.hibernateinheritance.entity.mappedsuperclass;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("ALL")
@MappedSuperclass
public class Person {
    @Id
    private Long personId;
    private String name;

    public Person(Long personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public Person() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
