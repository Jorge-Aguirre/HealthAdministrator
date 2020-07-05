import { Component, OnInit } from '@angular/core';
import { HospitalService } from 'src/app/services/hospital.service';
import { CommunicationService } from 'src/app/services/communication.service';
import { Router } from '@angular/router'
import { Hospital } from '../../models/hospital';

@Component({
  selector: 'app-hospitals-list',
  templateUrl: './hospitals-list.component.html',
  styleUrls: ['./hospitals-list.component.scss']
})
export class HospitalsListComponent implements OnInit {

  hospitals: Hospital[];
  currentIndex = -1;

  constructor(private hospitalService: HospitalService,
              private communicationService: CommunicationService,
              private router: Router) { }

  ngOnInit(): void {
    this.retrieveHospitals();

    this.communicationService.updateSelectedHospital(null);
  }

  private retrieveHospitals(): void {
    this.hospitalService.getAll()
      .subscribe(
        data => {
          this.hospitals = data;
          console.log(data);
        },
        error => {
          console.error(error);
        }
      )
  }

  refreshList(): void {
    this.retrieveHospitals();
    this.currentIndex = -1;
  }

  updateSelectedHospital(hospital: Hospital): void {
    this.communicationService.updateSelectedHospital(hospital);
  
    this.router.navigate(['/hospitals', hospital.id ]);
  }
}
