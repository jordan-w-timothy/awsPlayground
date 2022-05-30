package com.testy.testyapi.controller.ERS;

import com.testy.testyapi.dao.EmployeeDaoImplementation;
import com.testy.testyapi.model.Employee;
import com.testy.testyapi.model.LoginRequest;
import com.testy.testyapi.resposne.ResponseHandler;
import com.testy.testyapi.service.EmployeeService;
import org.apache.log4j.Logger;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/ERS")
public class ERSController {

    private static org.apache.log4j.Logger ERSControllerLogger = Logger.getLogger(ERSController.class);

    @PostMapping(value = "/login")
    public ResponseEntity<Object> ersLogin(@RequestBody LoginRequest body) {
        ERSControllerLogger.info("Starting ERS Login request body:" + body.toString());

        String userName = body.getUserName(),password = body.getPassword();
        System.out.println("USERNAME:  "  + userName + " PASSWORD: " + password);
        Employee tempEmployee = EmployeeService.validateLogin(userName, password);
        System.out.println("tempEmployee " + tempEmployee);
        ResponseEntity response = ResponseHandler.generateResponse(HttpStatus.OK, tempEmployee);
        ERSControllerLogger.info("RESPONSE: " + response);
        return response;
    }
}
