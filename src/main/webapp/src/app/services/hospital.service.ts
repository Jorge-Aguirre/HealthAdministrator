import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Hospital } from '../models/hospital';

const baseUrl = "http://localhost:8080/hospitals";

@Injectable({
  providedIn: 'root'
})
export class HospitalService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Hospital[]> {
    return this.http.get<Hospital[]>(baseUrl);
  }

  get(id: string): Observable<Hospital> {
    return this.http.get<Hospital>(`${baseUrl}/${id}`);
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }
}
