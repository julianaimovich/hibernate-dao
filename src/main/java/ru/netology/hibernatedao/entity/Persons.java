package ru.netology.hibernatedao.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Persons {
    @EmbeddedId
    private PersonData personData;

    private String phoneNumber;

    private String cityOfLiving;
}