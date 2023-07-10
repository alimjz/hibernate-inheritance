package com.train.hibernateinheritance.repository;

import com.train.hibernateinheritance.entity.singletable.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
