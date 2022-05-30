package com.testy.testyapi.controller;

import com.testy.testyapi.model.BankResponse;
import com.testy.testyapi.model.Schedule;
import com.testy.testyapi.resposne.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController {


    //Get endpoint to serve /demo/data.
    @GetMapping(value = "/ping")
    public ResponseEntity<Object> ping() {
        return ResponseHandler.generateResponse( HttpStatus.OK, new BankResponse("Schedule Ping Successful"));
    }
    @GetMapping(value = "/getSchedule")
    public ResponseEntity<Object> getSchedule() {
        /*
            24 Hour Clock
         */

        String[] events = new String[24];
         events[6] = "Wake Up !";
         events[8] = "Time for Work!";
         events[12] = "Lunch Time!...  zzz..";
         events[3] = "2 more hours....";
         events[5] = "Quiting Time";
         events[20] = "chill time";
         events[22] = "zzz...";
        Schedule sample = new Schedule("05/23/2022", "Monday", events);
        return ResponseHandler.generateResponse(HttpStatus.OK, sample);

    }

}
