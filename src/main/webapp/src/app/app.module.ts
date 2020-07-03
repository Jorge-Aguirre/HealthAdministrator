import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HospitalsListComponent } from './components/hospitals-list/hospitals-list.component';
import { AddHospitalComponent } from './component/add-hospital/add-hospital.component';
import { HospitalDetailsComponent } from './components/hospital-details/hospital-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HospitalsListComponent,
    AddHospitalComponent,
    HospitalDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
