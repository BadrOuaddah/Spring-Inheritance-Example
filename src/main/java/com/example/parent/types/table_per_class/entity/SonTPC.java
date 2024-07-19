package com.example.parent.types.table_per_class.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SonTPC extends FatherTPC {
    private String academicLevel;
}
