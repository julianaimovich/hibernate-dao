package ru.netology.hibernatedao;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.hibernatedao.entityBuilder.PersonsBuilder;
import ru.netology.hibernatedao.service.PersonsService;

@SpringBootApplication
public class HibernateDaoApplication implements CommandLineRunner {
    private final PersonsService personsService;

    public HibernateDaoApplication(PersonsService personsService) {
        this.personsService = personsService;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateDaoApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        personsService.addPerson(PersonsBuilder.getPersonMiron());
        personsService.addPerson(PersonsBuilder.getPersonIvan());
        personsService.addPerson(PersonsBuilder.getPersonOlga());
    }
}