package com.train.hibernateinheritance.service;

import com.train.hibernateinheritance.entity.tableperclass.Car;
import com.train.hibernateinheritance.entity.tableperclass.Vehicle;
import com.train.hibernateinheritance.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
        this.repository.save(new Car(1, "4 Cylinder", "Audi", "Black"));
        this.repository.save(new Car(2, "6 Cylinder", "Mustang", "Black"));
        this.repository.save(new Car(3, "4 Cylinder", "Benz", "White"));
    }

    public List<Vehicle> findAllVehicles(){
        return repository.findAll();
    }
}
