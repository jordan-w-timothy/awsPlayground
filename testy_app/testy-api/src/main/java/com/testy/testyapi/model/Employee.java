package com.testy.testyapi.model;

import java.util.Objects;

public class Employee {
    private int emp_ID;
    private String emp_firstName;
    private String emp_lastName;
    private String emp_userName;
    private String emp_password;
    private String emp_email;
    private String isManager;

    public Employee() {
    }

    public Employee(int emp_ID, String emp_firstName, String emp_lastName, String emp_userName, String emp_password, String emp_email, String isManager) {
        this.emp_ID = emp_ID;
        this.emp_firstName = emp_firstName;
        this.emp_lastName = emp_lastName;
        this.emp_userName = emp_userName;
        this.emp_password = emp_password;
        this.emp_email = emp_email;
        this.isManager = isManager;
    }

    public Employee(int emp_ID, String emp_firstName, String emp_lastName, String emp_userName, String emp_email, String isManager) {
        this.emp_ID = emp_ID;
        this.emp_firstName = emp_firstName;
        this.emp_lastName = emp_lastName;
        this.emp_userName = emp_userName;
        this.emp_email = emp_email;
        this.isManager = isManager;
    }

    public Employee(int emp_ID, String emp_firstName, String emp_lastName, String emp_userName, String emp_email) {
        this.emp_ID = emp_ID;
        this.emp_firstName = emp_firstName;
        this.emp_lastName = emp_lastName;
        this.emp_userName = emp_userName;
        this.emp_email = emp_email;
    }

    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public String getEmp_firstName() {
        return emp_firstName;
    }

    public void setEmp_firstName(String emp_firstName) {
        this.emp_firstName = emp_firstName;
    }

    public String getEmp_lastName() {
        return emp_lastName;
    }

    public void setEmp_lastName(String emp_lastName) {
        this.emp_lastName = emp_lastName;
    }

    public String getEmp_userName() {
        return emp_userName;
    }

    public void setEmp_userName(String emp_userName) {
        this.emp_userName = emp_userName;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return emp_ID == employee.emp_ID && Objects.equals(emp_firstName, employee.emp_firstName) && Objects.equals(emp_lastName, employee.emp_lastName) && Objects.equals(emp_userName, employee.emp_userName) && Objects.equals(emp_password, employee.emp_password) && Objects.equals(emp_email, employee.emp_email) && Objects.equals(isManager, employee.isManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_ID, emp_firstName, emp_lastName, emp_userName, emp_password, emp_email, isManager);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_ID=" + emp_ID +
                ", emp_firstName='" + emp_firstName + '\'' +
                ", emp_lastName='" + emp_lastName + '\'' +
                ", emp_userName='" + emp_userName + '\'' +
                ", emp_password='" + emp_password + '\'' +
                ", emp_email='" + emp_email + '\'' +
                ", isManager='" + isManager + '\'' +
                '}';
    }
}
