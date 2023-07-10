package com.train.hibernateinheritance.repository;

import com.train.hibernateinheritance.entity.tableperclass.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
