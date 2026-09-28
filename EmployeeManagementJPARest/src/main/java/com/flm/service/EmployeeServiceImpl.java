package com.flm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.model.Employee;
import com.flm.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repo;

    @Override
    public String addEmployee(Employee employee) {

        repo.save(employee);

        return "Employee Saved!!!";
    }

    @Override
    public String updateEmployee(Employee employee) {

        repo.save(employee);

        return "Employee Updated!!!";
    }

    @Override
    public String deleteEmployee(int employeeId) {

        repo.deleteById(employeeId);

        return "Employee Deleted!!!";
    }

    @Override
    public Employee getEmployee(int employeeId) {

        return repo.findById(employeeId).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployee() {

        return repo.findAll();
    }

    @Override
    public List<Employee> getAllEmployeesBetween(
            int initialSal,
            int finalSal) {

        return repo.findByEmpSalBetween(
                initialSal,
                finalSal);
    }

    @Override
    public List<Employee> getAllEmployeesByDesg(
            String employeeDesg) {

        return repo.findByEmpDesg(employeeDesg);
    }
}