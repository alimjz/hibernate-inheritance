package com.train.hibernateinheritance.service;

import com.train.hibernateinheritance.entity.joinedtable.Animal;
import com.train.hibernateinheritance.entity.joinedtable.Dog;
import com.train.hibernateinheritance.entity.joinedtable.Snake;
import com.train.hibernateinheritance.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
        this.repository.save(new Snake(1, "crawler", "Anaconda"));
        this.repository.save(new Dog(2, "canines", "Milow"));
    }

    public List<Animal> findAllAnimals(){
        return repository.findAll();
    }
}
