package com.train.hibernateinheritance.repository;

import com.train.hibernateinheritance.entity.joinedtable.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
}
