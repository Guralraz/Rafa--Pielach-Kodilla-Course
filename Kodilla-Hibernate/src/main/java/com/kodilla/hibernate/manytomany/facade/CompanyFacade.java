package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDAO;
import com.kodilla.hibernate.manytomany.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private final CompanyDAO companyDAO;
    private final EmployeeDAO employeeDAO;

    @Autowired
    public CompanyFacade(CompanyDAO companyDAO, EmployeeDAO employeeDAO) {
        this.companyDAO = companyDAO;
        this.employeeDAO = employeeDAO;
    }

    public List<Company> findCompaniesByPhrase(String searchedWord) {
        return companyDAO.retrieveCompaniesWhoseNameInclude(searchedWord);
    }

    public List<Employee> findEmployeesByPhrase(String searchedWord) {
        return employeeDAO.retrieveEmployeesWhoseNameInclude(searchedWord);
    }

}
