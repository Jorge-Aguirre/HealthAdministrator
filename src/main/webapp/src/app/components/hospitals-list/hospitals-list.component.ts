import { Component, OnInit } from '@angular/core';
import { HospitalService } from 'src/app/services/hospital.service';

@Component({
  selector: 'app-hospitals-list',
  templateUrl: './hospitals-list.component.html',
  styleUrls: ['./hospitals-list.component.scss']
})
export class HospitalsListComponent implements OnInit {

  hospitals: any;
  currentHospital = null;
  currentIndex = -1;
  title = ''

  constructor(private hospitalService: HospitalService) { }

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

}
