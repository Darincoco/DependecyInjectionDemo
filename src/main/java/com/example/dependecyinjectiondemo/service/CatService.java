package com.example.dependecyinjectiondemo.service;

import com.example.dependecyinjectiondemo.dao.CatRepository;
import com.example.dependecyinjectiondemo.model.Cat;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatService {

    private final CatRepository repository;

    public CatService(CatRepository repository) {
        System.out.println("cat service constructor called");
        this.repository = repository;
    }

    public List<Cat> getCats() {
        return repository.getAllCats();
    }
}
