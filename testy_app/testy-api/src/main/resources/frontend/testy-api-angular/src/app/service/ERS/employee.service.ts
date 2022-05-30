import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from 'src/app/models/ERS/user';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private _http: HttpClient) { }

  _ersLoginUrl = "http://localhost:8080/ERS/login"

  //Method call for POST request for login.
  login(user: User) {
    console.log(user.username);
    console.log(user.password);
    console.log(user);
    return this._http.post<any>(this._ersLoginUrl, user);
  }
}
