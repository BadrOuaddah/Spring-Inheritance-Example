package com.example.parent.types.singleTable.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("SecondSon")
@AllArgsConstructor
@NoArgsConstructor
public class SecondSon extends Father {
    private String name;
}
