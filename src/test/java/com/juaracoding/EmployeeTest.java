package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {
    Employee employee;

    @BeforeClass
    public void setUp(){
        employee = new Employee();
        employee.setName("Irfan Nur");
        employee.setDepartement("QA");
        employee.setSalary(7000);
    }
    @Test
    public void testGetName(){
        String expected = "Irfan Nur";
        String actual = employee.getName();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testGetDepartment(){
        Assert.assertEquals(employee.getDepartement(),"QA");
    }
    @Test
    public void testGetSalary(){
        Assert.assertEquals(employee.getSalary(),5000);

    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetSalaryNegative(){
        employee.setSalary(0);
    }
    @Test
    public void testCalculateTax(){
        employee.setSalary(7000);
        double expected = 350;
        double actual = employee.calculateTax(employee.getSalary());
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void testCalculateTaxNegative(){
        employee.setSalary(5000);
        double expected = 0;
        double actual = employee.calculateTax(employee.getSalary());
        Assert.assertEquals(actual,expected);

    }
}
