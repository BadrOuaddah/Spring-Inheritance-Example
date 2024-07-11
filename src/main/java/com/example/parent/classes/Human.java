package com.example.parent.classes;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Human {
    @Id
    private long humanId;
    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;
    private String colorEye;
    private String colorHair;

}