package com.example.dependecyinjectiondemo.controller;

import com.example.dependecyinjectiondemo.model.Cat;
import com.example.dependecyinjectiondemo.service.CatService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatController {

    private final CatService service;

    public CatController(CatService service) {
        System.out.println("cat controller constructor called");
        this.service = service;
    }

    public List<Cat> getAllCats() {
        return service.getCats();
    }
}
