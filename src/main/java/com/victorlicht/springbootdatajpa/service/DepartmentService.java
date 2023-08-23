package com.victorlicht.springbootdatajpa.service;

import com.victorlicht.springbootdatajpa.entity.Department;
import com.victorlicht.springbootdatajpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findById(Long id) {
        return departmentRepository.findById(id).orElseThrow();
    }
    public Long count() {
        return departmentRepository.count();
    }
}
