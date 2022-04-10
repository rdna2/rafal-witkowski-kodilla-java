package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Transactional
    @Test
    public void testRetrieveEmployeeByLastname() {
        //Given
        Employee employee1 = new Employee("Adam", "Anton");
        Employee employee2 = new Employee("Eve", "Bem");
        Employee employee3 = new Employee("John", "Anton");
        Employee employee4 = new Employee("Iga", "Swiatek");
        Employee employee5 = new Employee("Holly", "Anton");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(employee1);
        softwareMachine.getEmployees().add(employee2);
        dataMaesters.getEmployees().add(employee3);
        greyMatter.getEmployees().add(employee4);
        greyMatter.getEmployees().add(employee5);

        employee1.getCompanies().add(softwareMachine);
        employee2.getCompanies().add(softwareMachine);
        employee3.getCompanies().add(dataMaesters);
        employee4.getCompanies().add(greyMatter);
        employee5.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Employee> lastnameSearch = employeeDao.retrieveByLastname("Anton");

        //Then
        assertEquals(3, lastnameSearch.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Transactional
    @Test
    public void retrieveByFirst3Characters() {
        //Given
        Employee employee1 = new Employee("Adam", "Anton");
        Employee employee2 = new Employee("Eve", "Bem");
        Employee employee3 = new Employee("John", "Anton");
        Employee employee4 = new Employee("Iga", "Swiatek");
        Employee employee5 = new Employee("Holly", "Anton");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(employee1);
        softwareMachine.getEmployees().add(employee2);
        dataMaesters.getEmployees().add(employee3);
        greyMatter.getEmployees().add(employee4);
        greyMatter.getEmployees().add(employee5);

        employee1.getCompanies().add(softwareMachine);
        employee2.getCompanies().add(softwareMachine);
        employee3.getCompanies().add(dataMaesters);
        employee4.getCompanies().add(greyMatter);
        employee5.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> firstThreeChars = companyDao.retrieveByFirst3Characters("oft");

        //Then
        assertEquals(2, firstThreeChars.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}