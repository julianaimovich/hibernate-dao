package ru.netology.hibernatedao;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.hibernatedao.entityBuilder.PersonsBuilder;
import ru.netology.hibernatedao.service.PersonsService;

@SpringBootApplication
public class HibernateDaoApplication implements CommandLineRunner {
    @Autowired
    PersonsService personsService;

    public static void main(String[] args) {
        SpringApplication.run(HibernateDaoApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        personsService.addPerson(PersonsBuilder.getPerson());
    }
}