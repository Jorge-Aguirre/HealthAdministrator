import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { HospitalService } from '../../services/hospital.service';
import { CommunicationService } from '../../services/communication.service';
import { Hospital } from 'src/app/models/hospital';

@Component({
  selector: 'app-hospital-details',
  templateUrl: './hospital-details.component.html',
  styleUrls: ['./hospital-details.component.scss']
})
export class HospitalDetailsComponent implements OnInit {

  hospital: Hospital = new Hospital();

  constructor(private hospitalService: HospitalService,
              private communicationService: CommunicationService,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.retrieveHospital();
  }

  private retrieveHospital(): void {
    this.route.params.subscribe(params => {
      this.hospitalService.get(params["id"])
        .subscribe(
          data => {
            this.hospital = data;
            this.communicationService.updateSelectedHospital(data);
          },
          error => {
            console.error(error);
          }
        )
    })
  }
}
