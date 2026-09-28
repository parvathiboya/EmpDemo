package com.flm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findByEmpSalBetween(int initialSal, int finalSal);

    public List<Employee> findByEmpDesg(String empDesg);

}