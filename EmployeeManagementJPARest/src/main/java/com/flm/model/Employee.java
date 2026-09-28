package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_info")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int empId;

    private String empName;

    private int empSal;

    private String empDesg;

    public Employee() {
    }

    public Employee(int empId, String empName, int empSal, String empDesg) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        this.empDesg = empDesg;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public String getEmpDesg() {
        return empDesg;
    }

    public void setEmpDesg(String empDesg) {
        this.empDesg = empDesg;
    }
}