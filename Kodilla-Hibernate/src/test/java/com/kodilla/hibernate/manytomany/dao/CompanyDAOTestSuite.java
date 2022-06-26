package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDAO companyDAO;
    @Autowired
    private EmployeeDAO employeeDAO;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDAO.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDAO.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDAO.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMastersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDAO.deleteById(softwareMachineId);
            companyDAO.deleteById(dataMastersId);
            companyDAO.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testRetrieveCompaniesThatStartWith() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(johnSmith);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        johnSmith.getCompanies().add(dataMaesters);

        //When
        companyDAO.save(softwareMachine);
        companyDAO.save(dataMaesters);
        companyDAO.save(greyMatter);
        List<Company> retrievedCompanies = companyDAO.retrieveCompaniesThatStartWith("great");

        //Then
        assertNotEquals(retrievedCompanies.get(0).getId(), softwareMachine.getId());
        assertNotEquals(retrievedCompanies.get(0).getId(), dataMaesters.getId());
        assertEquals(retrievedCompanies.get(0).getId(), 54);

        //CleanUp
        try {
            companyDAO.deleteById(softwareMachine.getId());
            companyDAO.deleteById(dataMaesters.getId());
            companyDAO.deleteById(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testRetrieveEmployeeWhoseNameIs() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(stephanieClarckson);

        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(greyMatter);
        lindaKovalsky.getCompanies().add(dataMaesters);

        //When
        employeeDAO.save(johnSmith);
        employeeDAO.save(stephanieClarckson);
        employeeDAO.save(lindaKovalsky);
        List<Employee> retrievedEmployees = employeeDAO.retrieveEmployeeWhoseNameIs("Kovalsky");

        //Then
        assertNotEquals(retrievedEmployees.get(0).getId(), johnSmith.getId());
        assertNotEquals(retrievedEmployees.get(0).getId(), stephanieClarckson.getId());
        assertEquals(retrievedEmployees.get(0).getId(), 55);

        //CleanUp
        try {
            companyDAO.deleteById(softwareMachine.getId());
            companyDAO.deleteById(dataMaesters.getId());
            companyDAO.deleteById(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

}