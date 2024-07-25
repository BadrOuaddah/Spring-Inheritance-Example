package com.example.parent.types.singleTable.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Human {
    @Id
    private Long humanId;
    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;
    private String colorEye;
    private String colorHair;

}
