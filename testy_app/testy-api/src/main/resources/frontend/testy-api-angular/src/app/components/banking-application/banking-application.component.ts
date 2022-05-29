import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-banking-application',
  templateUrl: './banking-application.component.html',
  styleUrls: ['./banking-application.component.css']
})
export class BankingApplicationComponent implements OnInit {

  constructor(private http: HttpClient) { }

  rootURL = '/bank';
  pingResp = "";

  ngOnInit(): void {
  }

  ping() {
    console.log("in ping func");
    this.http.get<any>('http://localhost:8080/bank/ping').subscribe(data => {
      console.log(data);
    })
    
  }

  
  }
