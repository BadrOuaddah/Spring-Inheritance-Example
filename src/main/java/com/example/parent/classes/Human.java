package com.example.parent.classes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Human {
    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;
    private String colorEye;
    private String colorHair;

}
