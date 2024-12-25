package ru.netology.hibernatedao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedao.entity.PersonData;
import ru.netology.hibernatedao.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, PersonData> {

    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByPersonDataAgeLessThanOrderByPersonDataAgeAsc(int age);

    Optional<Persons> findByPersonDataNameAndPersonDataSurname(String name, String surname);
}