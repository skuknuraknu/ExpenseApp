package com.example.expensify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

}
