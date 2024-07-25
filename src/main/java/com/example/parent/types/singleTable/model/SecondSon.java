package com.example.parent.types.singleTable.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("SecondSon")
public class SecondSon extends Father {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long secondSonId;
}
