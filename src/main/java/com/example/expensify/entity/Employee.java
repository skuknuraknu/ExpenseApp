package com.example.expensify.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee extends ExpenseUser {
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Expense> expenses;

    // No-arg constructor (protected)
    protected Employee() {
        super("defaultUsername", "defaultPassword", Role.EMPLOYEE);  // Provide default values
        this.expenses = new ArrayList<>();
    }

    /*** Create 2 constructors for flexibility in creating Employee objects
     1. Constructor with only username and password
     2. Constructor with username, password, and expenses
    */
    public Employee(String username, String password ){
        this(username, password, new ArrayList<>());
    }
    public Employee(String username, String password, List<Expense> expenses){
        super(username, password, Role.EMPLOYEE);
        this.expenses = expenses;
    }
    // Get list of expenses for an employee
    public List<Expense> getExpenses() {
        return this.expenses;
    }

}
