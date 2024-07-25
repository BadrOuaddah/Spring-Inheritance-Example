package com.example.parent.types.tablePerClass.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SonTPC extends FatherTPC {
    private String academicLevel;
}
