package com.example.lab3_20211688.Controller;

import com.example.lab3_20211688.Entity.Employees;
import com.example.lab3_20211688.Entity.Job;
import com.example.lab3_20211688.Repository.EmployeeRepository;
import com.example.lab3_20211688.Repository.JobRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private final JobRepository jobRepository;

    public EmployeeController(EmployeeRepository employeeRepository, JobRepository jobRepository) {
        this.employeeRepository = employeeRepository;
        this.jobRepository = jobRepository;
    }



    @GetMapping({"","/empleados","/"})
    public String listarEmpleados(Model model){
        List<Employees> listaEmployees = employeeRepository.findAll();

        model.addAttribute("listaEmployees",listaEmployees);

        return "lista";
    }
    @GetMapping({"/historial"})
    public String mostrarHistorial(Model model){


        return "historial";
    }

    @GetMapping({"/editar"})
    public String mostrarEmployee(Model model, @RequestParam("id") Integer id){
        System.out.println(id);
        Optional<Employees> optEmployee = employeeRepository.findById(id);
        if(optEmployee.isPresent()){
            Employees employee = optEmployee.get();
            List<Job> listaJobs = jobRepository.findAll();

            model.addAttribute("employee", employee);
            model.addAttribute("listaJobs",listaJobs);
            return "/editar";

        }else{
            return "redirect:/employee";
        }

    }

}
