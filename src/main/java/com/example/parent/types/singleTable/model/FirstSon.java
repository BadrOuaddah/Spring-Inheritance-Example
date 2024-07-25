package com.example.parent.types.singleTable.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("FirstSon")
public class FirstSon extends Father {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long firstSonId;
}
