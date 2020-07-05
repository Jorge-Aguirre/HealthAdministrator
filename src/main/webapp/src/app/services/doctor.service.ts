import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Doctor } from '../models/doctor';

const baseUrl = "http://localhost:8080/hospitals";;

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  constructor(private http: HttpClient) { }

  getAll(hospitalId: string): Observable<Doctor[]> {
    return this.http.get<Doctor[]>(`${baseUrl}/${hospitalId}/doctors`);
  }
}
