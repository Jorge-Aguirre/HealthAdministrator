import { Component, OnInit } from '@angular/core';
import { Hospital } from 'src/app/models/hospital';
import { Doctor } from 'src/app/models/doctor';
import { HospitalService } from 'src/app/services/hospital.service';
import { DoctorService } from 'src/app/services/doctor.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-doctors-list',
  templateUrl: './doctors-list.component.html',
  styleUrls: ['./doctors-list.component.scss']
})
export class DoctorsListComponent implements OnInit {

  hospital: Hospital = new Hospital();
  doctors: Doctor[];

  constructor(private hospitalService: HospitalService,
              private doctorService: DoctorService,
              private router: ActivatedRoute) { }

  ngOnInit(): void {
    this.retrieveDoctors();
  }

  retrieveDoctors(): void {
    this.router.params.subscribe(params => {
      this.hospitalService.get(params["id"])
        .subscribe(
          data => {
            this.hospital = data;
            this.doctorService.getAll(this.hospital.id)
              .subscribe(
                data => {
                  this.doctors = data;
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
