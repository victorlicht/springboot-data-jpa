package com.victorlicht.springbootdatajpa.service;

import com.victorlicht.springbootdatajpa.DbStatistics;
import com.victorlicht.springbootdatajpa.entity.Employees;
import com.victorlicht.springbootdatajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employees findById(Long employee_id) {
        return employeeRepository.findById(employee_id).orElseThrow();
    }
    public Long count() {
        return employeeRepository.count();
    }
    public DbStatistics getDbStatistics() {
        return employeeRepository.getDbStatistics();
    }

    public Long getDepartment_stats() {
        return employeeRepository.count();
    }

    public Long getEmployees_stats() {
        return employeeRepository.count();
    }
}
