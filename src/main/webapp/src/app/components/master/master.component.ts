import { Component, OnInit } from '@angular/core';
import { Hospital } from '../../models/hospital';
import { CommunicationService } from '../../services/communication.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-master',
  templateUrl: './master.component.html',
  styleUrls: ['./master.component.scss']
})
export class MasterComponent implements OnInit {

  selectedHospital: Hospital = null;

  constructor(private router: Router,
              private communicationService: CommunicationService) { }

  ngOnInit(): void {
    this.communicationService.getSelectedHospital()
      .subscribe(hospital => {
        this.selectedHospital = hospital;
      })
  }

  firstMasterButtonClick(): void {
    this.router.navigate(['hospitals', this.selectedHospital.id, 'doctors']);
  }

  secondMasterButtonClick(): void {
    this.router.navigate(['hospitals', this.selectedHospital.id, 'patients']);
  }
}
