package com.testy.testyapi.dao;

import com.testy.testyapi.model.Employee;
import com.testy.testyapi.util.JDBCConnectionUtil;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @Purpose Class EmployeeDaoImplementation Used to implement methods from
 *          EmployeeDao Interface. All methods that deal with getting
 *          information from the Employee Table come from here.
 * @author Timothy Jordan
 *
 */


public class EmployeeDaoImplementation implements EmployeeDao{

    private static org.apache.log4j.Logger EmployeeDaoImpLogger = Logger.getLogger(EmployeeDaoImplementation.class);

    private static EmployeeDaoImplementation EmployeeDao;

    public static EmployeeDaoImplementation getEmployeeDao() {
        if(EmployeeDao == null) {
            EmployeeDao = new EmployeeDaoImplementation();
        }

        return EmployeeDao;
    }

    public Employee validateLogin(String userName, String password) {
        EmployeeDaoImpLogger.info("Starting validateLogin method. " + userName);
        Employee tempEmployee = null;

        try(Connection con = JDBCConnectionUtil.getConnection()) {

            String sql = "select * from employeetable where USER_NAME = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet results = ps.executeQuery();

            while(results.next()) {
                tempEmployee = new Employee(results.getInt("EMPLOYEE_ID"), results.getString("FIRST_NAME"),
                        results.getString("LAST_NAME"), results.getString("USER_NAME"),
                        results.getString("USER_PASSWORD"), results.getString("USER_EMAIL"),
                        results.getString("IS_MANAGER"));
            }

            if(tempEmployee != null) {
                if(password.equals(tempEmployee.getEmp_password())) {
                    EmployeeDaoImpLogger.info("Valid Login");
                    return tempEmployee;
                } else {
                    EmployeeDaoImpLogger.info("Invalid Password");
                    return null;
                }
            } else {
                EmployeeDaoImpLogger.info("Invalid Username");
                return null;
            }

        } catch (SQLException e) {
            EmployeeDaoImpLogger.info("SQL Exception from validate login");
            EmployeeDaoImpLogger.error(e.getMessage());
            return null;
        }

    }

}
