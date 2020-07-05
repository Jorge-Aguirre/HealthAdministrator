import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Patient } from '../models/patient';
import { Observable } from 'rxjs';

const baseUrl = "http://localhost:8080/hospitals";;

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  constructor(private http: HttpClient) { }

  getAll(hospitalId: string): Observable<Patient[]> {
    return this.http.get<Patient[]>(`${baseUrl}/${hospitalId}/patients`);
  }
}
