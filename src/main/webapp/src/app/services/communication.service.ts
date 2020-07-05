import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { Hospital } from '../models/hospital';

@Injectable({
  providedIn: 'root'
})
export class CommunicationService {
  private selectedHospital$: Subject<Hospital> = new Subject();

  constructor() { }

  getSelectedHospital(): Subject<Hospital> {
    return this.selectedHospital$;
  }

  updateSelectedHospital(hospital: Hospital): void {
    this.selectedHospital$.next(hospital);
  }
}
