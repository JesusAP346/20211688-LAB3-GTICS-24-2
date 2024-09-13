package com.example.lab3_20211688.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="department_id",nullable = false)
    private Integer id;

    private String department_name;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
