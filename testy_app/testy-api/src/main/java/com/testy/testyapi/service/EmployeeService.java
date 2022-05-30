package com.testy.testyapi.service;

import com.testy.testyapi.dao.EmployeeDaoImplementation;
import com.testy.testyapi.model.Employee;
import org.apache.log4j.Logger;

public class EmployeeService {

    private static org.apache.log4j.Logger EmployeeServiceLogger = Logger.getLogger(EmployeeService.class);

    private static EmployeeService currentEmployeeService;

    private EmployeeService() {

    }

    public static Employee validateLogin(String userName, String password) {
        EmployeeServiceLogger.info("Starting validateLogin method. " + userName);
        return EmployeeDaoImplementation.getEmployeeDao().validateLogin(userName, password);
    }
}
