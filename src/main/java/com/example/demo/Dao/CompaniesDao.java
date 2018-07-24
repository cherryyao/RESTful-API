package com.example.demo.Dao;

import com.example.demo.model.Companies;
import com.example.demo.model.Employee;

import java.util.List;

public interface CompaniesDao {
    List<Companies> getAllCompanies();

    Companies getSpecificCompanies(int id);

    List<Companies> addCompany(int id, String companyName, int employeesNumber, List<Employee> employeeList);
}
