package ru.netology.hibernatedao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.hibernatedao.entity.Persons;

import java.util.List;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Persons addPerson(Persons person) {
        entityManager.persist(person);
        return person;
    }

    @Transactional
    public List<Persons> getPersonsByCity(String city) {
        Query query = entityManager.createNamedQuery("findPersonsByCity", Persons.class);
        query.setParameter("city", city);
        return (List<Persons>) query.getResultList();
    }
}