package com.train.hibernateinheritance.entity.singletable;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PRODUCT_TYPE",discriminatorType = DiscriminatorType.INTEGER)
public class Product {
    @Id
    private long productId;
    private String name;

    public Product(long productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public Product(){}

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
