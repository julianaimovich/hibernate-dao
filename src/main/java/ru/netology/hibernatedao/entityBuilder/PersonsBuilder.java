package ru.netology.hibernatedao.entityBuilder;

import ru.netology.hibernatedao.entity.Persons;

public class PersonsBuilder {

    public static Persons getPerson() {
        return Persons.builder()
                .personData(getPersonData())
                .phoneNumber("88005553535")
                .cityOfLiving("Moscow")
                .build();
    }

    private static Persons.PersonData getPersonData() {
        return Persons.PersonData.builder()
                .name("Miron")
                .surname("Fyodorov")
                .age(39)
                .build();
    }
}