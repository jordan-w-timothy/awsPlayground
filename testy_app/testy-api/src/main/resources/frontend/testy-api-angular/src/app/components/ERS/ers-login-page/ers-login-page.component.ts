import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/app/models/ERS/user';
import { EmployeeService } from 'src/app/service/ERS/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ers-login-page',
  templateUrl: './ers-login-page.component.html',
  styleUrls: ['./ers-login-page.component.css']
})
export class ErsLoginPageComponent implements OnInit {

  userModel = new User("","");

  constructor(
    private http: HttpClient,
    private _employeeService: EmployeeService,
    private _router: Router
    ) { }

  ngOnInit(): void {
  }

  login() {
    console.log("In login()");
    this.http.post<any>('http://localhost:8080/ERS/login', {userName: 'twjordan', password: 'tim93'}).subscribe(data => {
      console.log(data);
    })
  }

  onSubmit() {
    console.log(this.userModel.username);
    console.log(this.userModel.password);
    this._employeeService.login(this.userModel).subscribe(data => {
      console.log(data);
      //Check if null response.
      if (data[0] == null) {
        console.log("Invalid Login");
      } else {
        console.log("Valid Login");
        this._router.navigate(["/ers-landing"])
      }
    })


  }

}
