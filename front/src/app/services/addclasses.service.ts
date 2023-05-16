import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from 'src/baseurl';

@Injectable({
  providedIn: 'root'
})
export class AddclassesService {

  constructor(private http:HttpClient) { }

  public addclass(classroom:any){
   return this.http.post(`${baseUrl}/classroom/`,classroom);
  }

  public getclass(){
    return this.http.get(`${baseUrl}/classroom/`);
  }

}
