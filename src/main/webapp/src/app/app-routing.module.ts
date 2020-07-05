import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HospitalsListComponent } from './components/hospitals-list/hospitals-list.component';
import { HospitalDetailsComponent } from './components/hospital-details/hospital-details.component';
import { AddHospitalComponent } from './components/add-hospital/add-hospital.component';

const routes: Routes = [
  { path: '', redirectTo: 'hospitals', pathMatch: 'full' },
  { path: 'hospitals', component: HospitalsListComponent },
  { path: 'hospitals/:id', component: HospitalDetailsComponent },
  { path: 'add', component: AddHospitalComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
