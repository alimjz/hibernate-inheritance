package com.train.hibernateinheritance.entity.joinedtable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@SuppressWarnings("ALL")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
    @Id
    private long animalId;
    private String animalType;

    public Animal(long animalId, String animalType) {
        this.animalId = animalId;
        this.animalType = animalType;
    }

    public Animal(){}
}
