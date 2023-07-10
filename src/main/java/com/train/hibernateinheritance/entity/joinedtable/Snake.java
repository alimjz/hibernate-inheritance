package com.train.hibernateinheritance.entity.joinedtable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@SuppressWarnings("ALL")
@Entity
@PrimaryKeyJoinColumn(name = "SNAKE_ID")
public class Snake extends Animal{
    private String name;

    public Snake(long animalId, String animalType, String name) {
        super(animalId, animalType);
        this.name = name;
    }

    public Snake(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
