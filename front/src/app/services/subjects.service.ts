import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from 'src/baseurl';

@Injectable({
  providedIn: 'root'
})
export class SubjectsService {

  constructor(private http:HttpClient) { }

  public addsubject(subjects:any){
   return this.http.post(`${baseUrl}/subject/`,subjects);
  }
  public getsubject(){
    return this.http.get(`${baseUrl}/subject/`);
  }
  public getsubjectinclass(cid:any){
      return this.http.get(`${baseUrl}/subject/classroom/sub/${cid}`);
  }
}
