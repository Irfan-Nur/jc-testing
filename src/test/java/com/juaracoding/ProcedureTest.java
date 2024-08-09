package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test(priority = 1)
    public void testOne(){
        System.out.println("Test One");
    }
    @Test(priority = 2)
    public void testTwo(){
        System.out.println("Test Two");
    }
    @Test(priority = 3)
    public void testThree(){
        System.out.println("Test Three");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

}
