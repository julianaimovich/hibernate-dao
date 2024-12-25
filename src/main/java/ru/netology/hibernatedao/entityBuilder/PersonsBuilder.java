package ru.netology.hibernatedao.entityBuilder;

import ru.netology.hibernatedao.entity.PersonData;
import ru.netology.hibernatedao.entity.Persons;

public class PersonsBuilder {

    public static Persons getPersonMiron() {
        return Persons.builder()
                .personData(getPersonDataMiron())
                .phoneNumber("88005553535")
                .cityOfLiving("Moscow")
                .build();
    }

    public static Persons getPersonIvan() {
        return Persons.builder()
                .personData(getPersonDataIvan())
                .phoneNumber("666666666")
                .cityOfLiving("Tver")
                .build();
    }

    public static Persons getPersonOlga() {
        return Persons.builder()
                .personData(getPersonDataOlga())
                .phoneNumber("666666666")
                .cityOfLiving("Moscow")
                .build();
    }

    private static PersonData getPersonDataMiron() {
        return PersonData.builder()
                .name("Miron")
                .surname("Fyodorov")
                .age(39)
                .build();
    }

    private static PersonData getPersonDataIvan() {
        return PersonData.builder()
                .name("Ivan")
                .surname("Fyodorov")
                .age(20)
                .build();
    }

    private static PersonData getPersonDataOlga() {
        return PersonData.builder()
                .name("Olga")
                .surname("Ivanova")
                .age(19)
                .build();
    }
}