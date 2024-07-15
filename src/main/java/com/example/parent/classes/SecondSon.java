package com.example.parent.classes;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("2")
public class SecondSon extends Father {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long secondSonId;
}
