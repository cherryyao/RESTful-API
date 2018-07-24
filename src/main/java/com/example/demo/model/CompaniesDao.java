package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CompaniesDao {
    private String companyName;
    private int employeesNumber;
    private List<Employee> EmployeeList = new ArrayList<>();

    public CompaniesDao(){}

    public CompaniesDao(String companyName, int employeesNumber, List<Employee> employeeList) {
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
        EmployeeList = employeeList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        EmployeeList = employeeList;
    }
}
