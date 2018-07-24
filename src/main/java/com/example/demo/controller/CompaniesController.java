package com.example.demo.controller;

import com.example.demo.Service.CompaniesService;
import com.example.demo.model.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompaniesController {
    @Autowired
    CompaniesService companiesService;

    @GetMapping("/companies")
    public List<Companies> getAllCompanies(){
        return companiesService.getAllCompanies();
    }


}
