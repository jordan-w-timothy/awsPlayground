package com.testy.testyapi.resposne;

import com.testy.testyapi.service.EmployeeService;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    private static org.apache.log4j.Logger ResponseHandlerLogger = Logger.getLogger(ResponseHandler.class);

    public static ResponseEntity<Object> generateResponse(HttpStatus status, Object responseObj) {
        ResponseHandlerLogger.info("STATUS: " + status + " responseObj:  " + responseObj);
        Map<String, Object> map = new HashMap<String, Object>();
        ResponseHandlerLogger.info("MAP: " + map);
        map.put("status", status.value());
        map.put("data", responseObj);
        ResponseHandlerLogger.info("MAP: " + map);

        return new ResponseEntity<Object>(map,status);
    }
}
