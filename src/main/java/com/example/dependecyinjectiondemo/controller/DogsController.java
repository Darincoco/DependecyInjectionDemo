package com.example.dependecyinjectiondemo.controller;

import com.example.dependecyinjectiondemo.model.Dog;
import com.example.dependecyinjectiondemo.service.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogsController {

    private DogsService service;

    public DogsController() {
        System.out.println("dog controller no-arg called");
    }

    public DogsController(DogsService service) {
        System.out.println("dog controller constructor called called called!!!!!!");
        this.service = service;
    }
    @Autowired
    public void setService(DogsService service) {
        System.out.println("dog controller setter called");
        this.service = service;
    }

    public List<Dog> getAllDogs(){
        return service.getDogs();
    }
}
