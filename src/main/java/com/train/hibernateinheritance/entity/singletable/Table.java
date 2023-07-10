package com.train.hibernateinheritance.entity.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("ALL")
@Entity
@DiscriminatorValue("1")
public class Table extends Product{
    private String color;

    public Table(long productId, String name, String color) {
        super(productId, name);
        this.color = color;
    }

    public Table() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
