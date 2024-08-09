package com.juaracoding;

public class Employee {
    private String name;
    private String departement;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0){
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary harus lebih dari 0");
        }
    }
    public double calculateTax (double salary){
        if (salary >= 7000){
            return salary*0.05;
        }else {
            return salary*0;
        }
    }

}
