package com.demo.lastAssignment.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.lastAssignment.model.Employees;
import com.demo.lastAssignment.service.EmployeeService;


@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeService, Long> {

    void save(Employees employee);
}