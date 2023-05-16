import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from 'src/baseurl';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {

  constructor(private _http:HttpClient) { }

  public addstudent(students:any){
    return this._http.post(`${baseUrl}/student/`,students);

  }

  public getstudentinclass(cid:any){
   return this._http.get(`${baseUrl}/student/classroom/${cid}`)
  }

}
