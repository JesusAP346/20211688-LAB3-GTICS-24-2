package com.example.lab3_20211688.Controller;

import com.example.lab3_20211688.Entity.Employees;
import com.example.lab3_20211688.Repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    @GetMapping({"","/list","/"})
    public String listarEmpleados(Model model){
        List<Employees> listaEmployees = employeeRepository.findAll();

        model.addAttribute("listaEmployees",listaEmployees);

        return "lista";
    }
    @GetMapping({"/historial"})
    public String mostrarHistorial(Model model){


        return "historial";
    }
}
