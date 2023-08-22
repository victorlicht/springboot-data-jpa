package com.victorlicht.springbootdatajpa.repository;

import com.victorlicht.springbootdatajpa.entity.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {

}
