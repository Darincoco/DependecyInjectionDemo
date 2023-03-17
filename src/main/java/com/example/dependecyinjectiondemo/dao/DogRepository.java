package com.example.dependecyinjectiondemo.dao;

import com.example.dependecyinjectiondemo.model.Dog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogRepository {

    public DogRepository() {
        System.out.println("dog repo no-arg repo called");
    }

    public List<Dog> getAllDogs(){
        System.out.println("called dog repo");
        return null;
    }
}
