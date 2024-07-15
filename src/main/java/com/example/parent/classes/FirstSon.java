package com.example.parent.classes;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("1")
public class FirstSon extends Father {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long firstSonId;
}
