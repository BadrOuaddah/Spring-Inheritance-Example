package com.example.parent.types.single_table.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("SecondSon")
public class SecondSon extends Father {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long secondSonId;
}
