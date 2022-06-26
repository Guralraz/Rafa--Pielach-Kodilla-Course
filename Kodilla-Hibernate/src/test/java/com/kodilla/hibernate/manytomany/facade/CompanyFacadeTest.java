package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyFacadeTestSuite {

    @Autowired
    public CompanyFacade companyFacade;

    @Test
    public void testFindCompaniesByPhrase() {
        //Given

        //When
        List<Company> retrievedCompanies = companyFacade.findCompaniesByPhrase("war");

        //Then
        assertEquals(17, retrievedCompanies.size());
    }

}