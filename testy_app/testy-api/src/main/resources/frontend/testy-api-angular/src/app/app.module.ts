import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {  RouterModule } from '@angular/router';
import { HttpClientModule,HttpClient } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { BankingApplicationComponent } from './components/banking-application/banking-application.component';
import { ScheduleAppComponent } from './components/schedule-app/schedule-app.component';
import { ErsLandingPageComponent } from './components/ERS/ers-landing-page/ers-landing-page.component';
import { ErsLoginPageComponent } from './components/ERS/ers-login-page/ers-login-page.component';


@NgModule({
  declarations: [
    AppComponent,
    LandingPageComponent,
    BankingApplicationComponent,
    ScheduleAppComponent,
    ErsLandingPageComponent,
    ErsLoginPageComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: LandingPageComponent},
      {path: 'bank', component: BankingApplicationComponent},
      {path: 'schedule', component: ScheduleAppComponent},
      {path: 'ers-login', component: ErsLoginPageComponent},
      {path: 'ers-landing', component: ErsLandingPageComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
