package com.testy.testyapi.dao;

import com.testy.testyapi.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public Employee validateLogin(String userName, String password);
//    public Employee getEmployee(String userName);
//    public Employee getEmployee(int emp_ID);
//    public boolean checkUser(String userName, String password);
//    public Employee updateEmployee(int emp_ID, String firstName, String userName, String lastName, String email, String password);
    //Manager
//    public List<Employee> getAllEmployees();
//    public boolean addEmployee(String userName,String firstName, String lastName, String password, String email, String isManager);
}
