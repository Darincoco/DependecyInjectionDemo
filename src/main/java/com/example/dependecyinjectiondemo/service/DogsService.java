package com.example.dependecyinjectiondemo.service;

import com.example.dependecyinjectiondemo.dao.DogRepository;
import com.example.dependecyinjectiondemo.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogsService {

    private DogRepository repository;
    public DogsService() {
        System.out.println("no-arg constructor dog service");
    }

    public DogsService(DogRepository repository) {
        System.out.println("dog service constructor called");
        this.repository = repository;
    }
    @Autowired
    public void setRepository(DogRepository repository) {
        System.out.println("dog service setter called");
        this.repository = repository;
    }

    public List<Dog> getDogs() {
        return repository.getAllDogs();
    }
}
