package com.example.demo.Service;

import com.example.demo.Dao.CompaniesDao;
import com.example.demo.model.Companies;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class CompaniesService implements CompaniesDao {
    private List<Companies> CompaniesList = new ArrayList<>();

    @Override
    public List<Companies> getAllCompanies(){
//        Employee employee1 = new Employee(1,"aaa",22,"male");
//        Employee employee2 = new Employee(2,"bbb",22,"male");
//        List<Employee> EmployeeList = new ArrayList<>();
//        EmployeeList.add(employee1);
//        EmployeeList.add(employee2);
//        CompaniesList.add(new Companies(1,"alibaba",2,EmployeeList));
        return CompaniesList;
    }

    @Override
    public Companies getSpecificCompanies(int id){
        for(Companies companies:CompaniesList){
            if (id == companies.getId()){
                return companies;
            }
        }
        return null;
        //return CompaniesList.stream().filter(companies -> companies.getId()==id)
    }

    @Override
    public List<Companies> addCompany(int id, String companyName, int employeesNumber, List<Employee> employeeList){
        CompaniesList.add(new Companies(id,companyName,employeesNumber,employeeList));
        return CompaniesList;
    }

}
