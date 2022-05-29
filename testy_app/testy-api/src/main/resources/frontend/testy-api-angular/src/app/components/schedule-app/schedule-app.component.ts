import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { schedule } from 'src/app/interfaces/schedule';

@Component({
  selector: 'app-schedule-app',
  templateUrl: './schedule-app.component.html',
  styleUrls: ['./schedule-app.component.css']
})
export class ScheduleAppComponent implements OnInit {

  schedule: schedule = {
    date: "Saturday",
    title: "Lazy Schedule"
  };

  date: string = "Date";
  title: string = "Title";
  eventsArray: any[] = new Array();

  constructor(private http: HttpClient) { }

  
  events: String[] = ["Saturday","zz", "zz"]; 

  ngOnInit(): void {
  }

  ping () {
    console.log("In Schedule App ping method.")
    this.http.get<any>('http://localhost:8080/schedule/ping').subscribe(data => {
      console.log(data);
    })
  }

  getSchedule() {
    console.log("In getSChedule");
    this.http.get<any>('http://localhost:8080/schedule/getSchedule').subscribe(data => {
      console.log(data);
      console.log(data.data);
      console.log(data.data.date);
      this.date = data.data.date;
      this.title = data.data.title;
      console.log(data.data.events);
      console.log(data.data.events[0]);
      this.eventsArray[0] = data.data.events[0];
      for(let i = 0; i < data.data.events.length; i++) {
        
        this.eventsArray[i] = data.data.events[i];
        console.log(this.eventsArray[i]);
      }
      
    })
  }

  scheduleHome() {

  }
}
