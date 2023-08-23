package com.victorlicht.springbootdatajpa.repository;

import com.victorlicht.springbootdatajpa.DbStatistics;
import com.victorlicht.springbootdatajpa.entity.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {

    @Query(value = "SELECT (SELECT COUNT(*) FROM employees) AS employees_stats,\n" +
            "        (SELECT COUNT(*) FROM department) AS department_stats;",
    nativeQuery = true)
    DbStatistics getDbStatistics();
}
