import { Component, OnInit } from '@angular/core';
import { HospitalService } from 'src/app/services/hospital.service';
import { CommunicationService } from 'src/app/services/communication.service';
import { Hospital } from '../../models/hospital';

@Component({
  selector: 'app-hospitals-list',
  templateUrl: './hospitals-list.component.html',
  styleUrls: ['./hospitals-list.component.scss']
})
export class HospitalsListComponent implements OnInit {

  hospitals: Hospital[];
  currentHospital: Hospital = null;
  currentIndex = -1;

  constructor(private hospitalService: HospitalService,
              private communicationService: CommunicationService) { }

  ngOnInit(): void {
    this.retrieveHospitals();
  }

  retrieveHospitals(): void {
    this.hospitalService.getAll()
      .subscribe(
        data => {
          this.hospitals = data;
          console.log(data);
        },
        error => {
          console.log(error);
        }
      )
  }

  refreshList(): void {
    this.retrieveHospitals();
    this.currentHospital = null;
    this.currentIndex = -1;
  }

  updateSelectedHospital(hospital: Hospital): void {
    this.communicationService.updateSelectedHospital(hospital);
  }
}
