package com.example.lab3_20211688.Repository;

import java.util.List;

import com.example.lab3_20211688.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees,Integer> {

}
