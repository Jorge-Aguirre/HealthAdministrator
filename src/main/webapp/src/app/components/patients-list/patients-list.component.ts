import { Component, OnInit } from '@angular/core';
import { HospitalService } from 'src/app/services/hospital.service';
import { PatientService } from 'src/app/services/patient.service';
import { Hospital } from 'src/app/models/hospital';
import { Patient } from 'src/app/models/patient';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-patients-list',
  templateUrl: './patients-list.component.html',
  styleUrls: ['./patients-list.component.scss']
})
export class PatientsListComponent implements OnInit {

  hospital: Hospital = new Hospital();
  patients: Patient[];

  constructor(private hospitalService: HospitalService,
              private patientService: PatientService,
              private router: ActivatedRoute) { }

  ngOnInit(): void {
    this.retrievePatients();
  }

  retrievePatients(): void {
    this.router.params.subscribe(params => {
      this.hospitalService.get(params["id"])
        .subscribe(
          data => {
            this.hospital = data;
            this.patientService.getAll(this.hospital.id)
              .subscribe(
                data => {
                  this.patients = data;
                },
                error => {
                  console.log(error);
                }
              )
          },
          error => {
            console.error(error);
          }
        )
    })
  }
}
