import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HospitalsListComponent } from './components/hospitals-list/hospitals-list.component';
import { AddHospitalComponent } from './components/add-hospital/add-hospital.component';
import { HospitalDetailsComponent } from './components/hospital-details/hospital-details.component';

import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    HospitalsListComponent,
    AddHospitalComponent,
    HospitalDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
