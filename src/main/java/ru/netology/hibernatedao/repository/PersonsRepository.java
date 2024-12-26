package ru.netology.hibernatedao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedao.entity.PersonData;
import ru.netology.hibernatedao.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, PersonData> {

    @Query("select p from Persons p where p.cityOfLiving = :city")
    List<Persons> findByCityOfLiving(@Param("city") String city);

    @Query("select p from Persons p where p.personData.age < :age order by p.personData.age asc")
    List<Persons> findByPersonDataAgeLessThanOrderByPersonDataAgeAsc(@Param("age") int age);

    @Query("select p from Persons p where p.personData.name = :name and p.personData.surname = :surname")
    Optional<Persons> findByPersonDataNameAndPersonDataSurname(@Param("name") String name, @Param("surname") String surname);
}