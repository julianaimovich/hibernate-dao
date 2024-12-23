package ru.netology.hibernatedao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findPersonsByCity", query = "SELECT e FROM Persons e WHERE e.cityOfLiving = :city")
public class Persons {

    @EmbeddedId
    private PersonData personData;

    private String phoneNumber;

    private String cityOfLiving;

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public static class PersonData implements Serializable {
        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private String surname;

        @Column(nullable = false)
        private int age;
    }
}