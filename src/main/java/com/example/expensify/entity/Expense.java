package com.example.expensify.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Expense {
    private String merchant;
    private String description;
    private LocalDate purchaseDate;
    private double amount;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private Status status;
}
