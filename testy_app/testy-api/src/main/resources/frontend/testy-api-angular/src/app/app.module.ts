import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {  RouterModule } from '@angular/router';
import { HttpClientModule,HttpClient } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { BankingApplicationComponent } from './components/banking-application/banking-application.component';


@NgModule({
  declarations: [
    AppComponent,
    LandingPageComponent,
    BankingApplicationComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: LandingPageComponent},
      {path: 'bank', component: BankingApplicationComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
