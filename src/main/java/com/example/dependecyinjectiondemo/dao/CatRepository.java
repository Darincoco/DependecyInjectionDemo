package com.example.dependecyinjectiondemo.dao;

import com.example.dependecyinjectiondemo.model.Cat;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatRepository {

    public CatRepository() {
        System.out.println("cat repo constructor called");
    }

    public List<Cat> getAllCats() {
        System.out.println("called cat repo");
        return List.of(
                new Cat("Milo", 2),
                new Cat("Luna", 4)
        );
    }
}
