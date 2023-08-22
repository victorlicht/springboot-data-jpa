package com.victorlicht.springbootdatajpa.controller;

import com.victorlicht.springbootdatajpa.entity.Employees;
import com.victorlicht.springbootdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employees findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }
}
