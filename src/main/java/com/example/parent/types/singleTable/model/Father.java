package com.example.parent.types.singleTable.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "father", discriminatorType = DiscriminatorType.STRING)
public class Father extends Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fatherId;
    private String academicLevel;
    private String job;
    private double salary;

}
