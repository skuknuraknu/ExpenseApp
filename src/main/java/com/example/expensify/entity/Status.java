package com.example.expensify.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private State state;
    private String reviewedBy;
    private LocalDate reviewedDate;
    private String comment;
    public enum State {
        IN_REVIEW,
        APPROVED,
        REJECTED
    }

}
