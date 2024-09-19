package com.codefirstgirls.spring.data.data_demo.model;

import jakarta.persistence.*;

@Entity
public class Otter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
    private int age;
    private double weight;
}
