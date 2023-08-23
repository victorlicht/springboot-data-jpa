package com.victorlicht.springbootdatajpa.controller;

import com.victorlicht.springbootdatajpa.DbStatistics;
import com.victorlicht.springbootdatajpa.entity.Employees;
import com.victorlicht.springbootdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements DbStatistics {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employees findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }
    @GetMapping("/count")
    public Long count() {
        return employeeService.count();
    }
    @GetMapping("/stats")
    public ResponseEntity<?> getDbStatistics() {
        return ResponseEntity.ok(employeeService.getDbStatistics());
    }

    @Override
    @GetMapping("/employees-count")
    public Long getEmployees_stats() {
        return employeeService.getEmployees_stats();
    }

    @Override
    @GetMapping("/department-count")
    public Long getDepartment_stats() {
        return employeeService.getDepartment_stats();
    }
}
