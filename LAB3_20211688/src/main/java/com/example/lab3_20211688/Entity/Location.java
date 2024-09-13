package com.example.lab3_20211688.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="location_id",nullable=false)
    private Integer id;

    private String  city;


}
