package com.testy.testyapi.util;


import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class JDBCConnectionUtil {

    //Setup Logger
    final static org.apache.log4j.Logger JDBCUtilLogger = Logger.getLogger(JDBCConnectionUtil.class);

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        JDBCUtilLogger.info("Starting getConnection method.");
        String urlFileInput = "";
        String userNameFileinput = "";
        String passwordFileInput = "";

        try (BufferedReader bf = new BufferedReader(new FileReader("src\\main\\resources\\JDBCLoginInfo.properties"));) {

            urlFileInput = bf.readLine();
            userNameFileinput = bf.readLine();
            passwordFileInput = bf.readLine();


        } catch (IOException e) {
            e.printStackTrace();
            JDBCUtilLogger.error("File Not Found");
        }

        return DriverManager.getConnection(urlFileInput,userNameFileinput,passwordFileInput);

    }
}
