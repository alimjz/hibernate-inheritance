package com.train.hibernateinheritance.entity.joinedtable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@SuppressWarnings("ALL")
@Entity
@PrimaryKeyJoinColumn(name = "dogId")
public class Dog extends Animal{
    private String dogName;

    public Dog(long animalId, String animalType,String dogName) {
        super(animalId,animalType);
        this.dogName = dogName;
    }

    public Dog(){}

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
}
