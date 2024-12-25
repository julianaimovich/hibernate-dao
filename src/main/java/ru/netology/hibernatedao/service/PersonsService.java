package ru.netology.hibernatedao.service;

import org.springframework.stereotype.Service;
import ru.netology.hibernatedao.entity.Persons;
import ru.netology.hibernatedao.repository.PersonsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonsService {
    private final PersonsRepository personsRepository;

    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public Persons addPerson(Persons person) {
        return personsRepository.save(person);
    }

    public List<Persons> getPersonsByCity(String city) {
        return personsRepository.findByCityOfLiving(city);
    }

    public List<Persons> getPersonsLessThanAge(int age) {
        return personsRepository.findByPersonDataAgeLessThanOrderByPersonDataAgeAsc(age);
    }

    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {
        return personsRepository.findByPersonDataNameAndPersonDataSurname(name, surname);
    }
}