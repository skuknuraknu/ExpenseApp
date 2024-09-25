package com.example.expensify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviewers")
public class Reviewer extends ExpenseUser{
    protected Reviewer() {
        super("default", "default", Role.REVIEWER);
    }
    public Reviewer( String username, String password) {
        super(username, password, Role.REVIEWER);
    }
}
