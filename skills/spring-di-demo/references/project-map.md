# Project Map

## Purpose

This repository is a small Spring Boot example for demonstrating dependency injection basics.

## Current Bean Chain

1. `controller/DogsController.java`
   Manages access to the dog-related flow and depends on `DogsService`.
2. `service/DogsService.java`
   Contains application logic and depends on `DogRepository`.
3. `dao/DogRepository.java`
   Represents the data-access layer for dogs.

## Relevant Files

- `src/main/java/com/example/dependecyinjectiondemo/DependecyInjectionDemoApplication.java`
  Spring Boot entry point.
- `src/main/java/com/example/dependecyinjectiondemo/controller/DogsController.java`
  Demo controller bean.
- `src/main/java/com/example/dependecyinjectiondemo/service/DogsService.java`
  Demo service bean.
- `src/main/java/com/example/dependecyinjectiondemo/dao/DogRepository.java`
  Demo repository bean.
- `src/main/java/com/example/dependecyinjectiondemo/model/Dog.java`
  Demo model.

## Notes

- The current code mixes constructor injection and setter injection to show different approaches.
- `DogRepository#getAllDogs()` currently returns `null`, so this project is better treated as a DI wiring demo than a complete API example.
