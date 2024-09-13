package com.example.lab3_20211688.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employee_id",nullable=false)
    private Integer id;

    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

}
