package com.example.parent.types.joined.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SonJ extends FatherJ {
    private String subject;
}
