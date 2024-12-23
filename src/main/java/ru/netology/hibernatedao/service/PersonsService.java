package ru.netology.hibernatedao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernatedao.entity.Persons;
import ru.netology.hibernatedao.repository.PersonsRepository;

import java.util.List;

@Service
public class PersonsService {
    @Autowired
    PersonsRepository personsRepository;

    public Persons addPerson(Persons person) {
        return personsRepository.addPerson(person);
    }

    public List<Persons> getPersonsByCity(String city) {
        return personsRepository.getPersonsByCity(city);
    }
}