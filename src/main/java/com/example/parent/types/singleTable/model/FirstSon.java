package com.example.parent.types.singleTable.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("FirstSon")
@AllArgsConstructor
@NoArgsConstructor
public class FirstSon extends Father {
    private String fullName;
}
