package ru.netology.hibernatedao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedao.entity.Persons;
import ru.netology.hibernatedao.service.PersonsService;

import java.util.List;

@RestController
public class PersonsController {
    @Autowired
    PersonsService service;

    @GetMapping("/persons/by-city")
    public List<Persons> getProductsNames(String city) {
        return service.getPersonsByCity(city);
    }
}