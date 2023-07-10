package com.train.hibernateinheritance.controller;

import com.train.hibernateinheritance.entity.tableperclass.Vehicle;
import com.train.hibernateinheritance.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vehicle> findAllAnimals(){
        return service.findAllVehicles();
    }
}
