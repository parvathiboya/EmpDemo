package com.flm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.flm.model.Employee;
import com.flm.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    
    EmployeeService service;

    @GetMapping
    public String sayHello() {

        return "Hello from Employee Controller";
    }

    @PostMapping("/add")
    public String insertEmployee(@RequestBody Employee employee) {

        return service.addEmployee(employee);
    }

    @PutMapping("/update")
    public String mergeEmployee(@RequestBody Employee employee) {

        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{eid}")
    public String deleteEmployee(@PathVariable("eid") int empId) {

        return service.deleteEmployee(empId);
    }

    @GetMapping("/getEmployee/{eid}")
    public Employee getEmployee(@PathVariable("eid") int empId) {

        return service.getEmployee(empId);
    }

    @GetMapping("/fetchAll")
    public List<Employee> getAll() {

        return service.getAllEmployee();
    }

    @GetMapping("/fetchAllBetween/{s1}/{s2}")
    public List<Employee> getAllBetween(
            @PathVariable int s1,
            @PathVariable int s2) {

        return service.getAllEmployeesBetween(s1, s2);
    }

    @GetMapping("/fetchAllByDesg/{desg}")
    public List<Employee> getAllByDesg(
            @PathVariable String desg) {

        return service.getAllEmployeesByDesg(desg);
    }
}