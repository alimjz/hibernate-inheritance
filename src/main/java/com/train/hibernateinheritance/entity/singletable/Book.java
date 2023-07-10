package com.train.hibernateinheritance.entity.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("ALL")
@Entity
@DiscriminatorValue("2")
public class Book extends Product {
    private String author;

    public Book(long productId, String name, String author) {
        super(productId, name);
        this.author = author;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
