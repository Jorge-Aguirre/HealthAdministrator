import { Component, OnInit } from '@angular/core';
import { Hospital } from '../../models/hospital';
import { CommunicationService } from '../../services/communication.service';

@Component({
  selector: 'app-master',
  templateUrl: './master.component.html',
  styleUrls: ['./master.component.scss']
})
export class MasterComponent implements OnInit {

  selectedHospital: Hospital = null;

  constructor(private communicationService: CommunicationService) { }

  ngOnInit(): void {
    this.communicationService.getSelectedHospital()
      .subscribe(hospital => {
        this.selectedHospital = hospital;
      })
  }

}
