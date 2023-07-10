package com.train.hibernateinheritance.entity.tableperclass;

import javax.persistence.Entity;

@SuppressWarnings("ALL")
@Entity
public class Car extends Vehicle{
    private String brand;
    private String color;

    public Car(){}

    public Car(long vehicleId, String engine, String brand, String color) {
        super(vehicleId, engine);
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
