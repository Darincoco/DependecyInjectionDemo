package com.example.dependecyinjectiondemo;

import com.example.dependecyinjectiondemo.controller.CatController;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DependecyInjectionDemoApplicationTests {

    @Autowired
    private CatController catController;

    @Test
    void contextLoads() {
    }

    @Test
    void catDependencyChainLoadsAndReturnsCats() {
        assertNotNull(catController);
        assertEquals(2, catController.getAllCats().size());
    }

}
