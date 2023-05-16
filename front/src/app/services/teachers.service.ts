import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from 'src/baseurl';

@Injectable({
  providedIn: 'root'
})
export class TeachersService {

  constructor(private http:HttpClient) { }
public addteacher(teachers:any)
{
  return this.http.post(`${baseUrl}/teacher/`,teachers);
}

public getteachersinsubject(subid:any){
  return this.http.get(`${baseUrl}/teacher/subject/${subid}`)
}

}
