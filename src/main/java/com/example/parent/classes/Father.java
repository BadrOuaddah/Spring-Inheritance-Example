package com.example.parent.classes;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Father extends Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fatherId;
    private String academicLevel;
    private String job;
    private double salary;

}
