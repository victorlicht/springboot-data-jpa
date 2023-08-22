package com.victorlicht.springbootdatajpa.repository;

import com.victorlicht.springbootdatajpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
