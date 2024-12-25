package ru.netology.hibernatedao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedao.entity.Persons;
import ru.netology.hibernatedao.service.PersonsService;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonsController {
    private final PersonsService service;

    public PersonsController(PersonsService personsService) {
        this.service = personsService;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getProductsNames(String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> getPersonsLessThanAge(int age) {
        return service.getPersonsLessThanAge(age);
    }

    @GetMapping("/persons/by-name")
    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {
        return service.getPersonsByNameAndSurname(name, surname);
    }
}