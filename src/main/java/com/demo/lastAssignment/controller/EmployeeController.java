package com.demo.lastAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

import com.demo.lastAssignment.model.Employees;
import com.demo.lastAssignment.service.EmployeeService;

//import ch.qos.logback.core.model.Model;


@Controller
public class EmployeeController {
     @Autowired
     private EmployeeService employeeService;

     // @GetMapping("/employees")
     // public String getAllEmployees(Model model) {
     //      List<Employee> employees = employeeService.getAllEmployees();
     //      model.addAttribute("employees", employees);
     //      return "employees";
     // }

     @GetMapping("/index")
     public String index(){
          return "addEmployee";
     }
 
     @PostMapping("/index")
     public String addEmployee(@ModelAttribute Employees employee) {
         employeeService.addEmployee(employee);
         System.out.println("User Added");
         return "addEmployee";
     }

     @GetMapping("/delete/{id}")
     public String deleteEmployee(@PathVariable Long id) {
          employeeService.deleteEmployee(id);
          return "redirect:/employees";
     }
    // @GetMapping("/index")
    // public String home() {
    //     return "index";
    // }

    //  @PostMapping("/saveUser")
    // public String register(@RequestBody userModel usermodel) {

    //     us.addUser(usermodel);
    //     System.out.println("user added");
    //     return "user added sucessfully";

    // }

    
}
