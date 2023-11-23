package com.demo.lastAssignment.service;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.lastAssignment.model.Employees;
import com.demo.lastAssignment.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // public List<Employees> getAllEmployees() {
    //     return  (List<Employees>) employeeRepository.findAll();
        
    // }

    public Optional<EmployeeService> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public void addEmployee(Employees employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    
}
