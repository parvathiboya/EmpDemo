package com.flm.service;

import java.util.List;

import com.flm.model.Employee;

public interface EmployeeService {

    public abstract String addEmployee(Employee employee);

    public abstract String updateEmployee(Employee employee);

    public abstract Employee getEmployee(int employeeId);

    public abstract String deleteEmployee(int employeeId);

    public abstract List<Employee> getAllEmployee();

    public abstract List<Employee> getAllEmployeesBetween(
            int initialSal, int finalSal);

    public abstract List<Employee> getAllEmployeesByDesg(
            String employeeDesg);
}