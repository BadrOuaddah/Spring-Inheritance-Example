package com.example.parent.types.singleTable.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "father", discriminatorType = DiscriminatorType.STRING)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Father {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fatherId;
    private String academicLevel;
    private String job;
    private double salary;

}
