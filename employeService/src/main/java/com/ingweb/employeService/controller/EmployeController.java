package com.ingweb.employeService.controller;

import com.ingweb.employeService.entity.Employe;
import com.ingweb.employeService.service.EmployeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    private final EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @PostMapping
    public Employe saveEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}
