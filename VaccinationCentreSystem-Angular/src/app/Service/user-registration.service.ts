import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../Model/User';

@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  USER_REGISTER_URL = "http://localhost:2222";

  constructor(private http: HttpClient) { }


  public registerUser(user: User): Observable<User>{
    return this.http.post<User>(this.USER_REGISTER_URL + "/register", user, {responseType:'text' as 'json'});
  }

  public getAllUsers(): Observable<User[]>{
    return this.http.get<User[]>(this.USER_REGISTER_URL + "/getAllUsers");
  }

  // public getPatientByDistrict(district: string){
  //   return this.http.get<Patient>("http://localhost:9090//findPatient/" + district);
  // }

  // public getPatientById(id: string){
  //   return this.http.get<Patient>("http://localhost:9090//findPatient/" + id);
  // }

  // public updatePatient(id: number, patient: Patient){
  //   return this.http.put<Patient>("http://localhost:9090/cancel/" + id, patient);
  // }

  // public deletePatient(id: number){
  //   return this.http.delete<Patient>("http://localhost:9090/cancel/" + id);
  // }
}
