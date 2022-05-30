package com.testy.testyapi.controller;

import com.testy.testyapi.model.BankResponse;
import com.testy.testyapi.resposne.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/bank")
public class BankingController {

    //Get endpoint to serve /demo/data.
    @GetMapping(value = "/ping")
    public ResponseEntity<Object> ping() {
        return ResponseHandler.generateResponse( HttpStatus.OK, new BankResponse("Ping Successful"));
    }
}
