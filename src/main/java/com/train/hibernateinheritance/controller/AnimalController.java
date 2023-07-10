package com.train.hibernateinheritance.controller;

import com.train.hibernateinheritance.entity.joinedtable.Animal;
import com.train.hibernateinheritance.service.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/animal")
public class AnimalController {
    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> findAllAnimals(){
        return service.findAllAnimals();
    }
}
