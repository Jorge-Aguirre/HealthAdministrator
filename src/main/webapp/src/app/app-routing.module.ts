import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HospitalsListComponent } from './components/hospitals-list/hospitals-list.component';
import { HospitalDetailsComponent } from './components/hospital-details/hospital-details.component';
import { DoctorsListComponent } from './components/doctors-list/doctors-list.component';
import { PatientsListComponent } from './components/patients-list/patients-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'hospitals', pathMatch: 'full' },
  { path: 'hospitals', component: HospitalsListComponent },
  { path: 'hospitals/:id', component: HospitalDetailsComponent },
  { path: 'hospitals/:id/doctors', component: DoctorsListComponent },
  { path: 'hospitals/:id/patients', component: PatientsListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
