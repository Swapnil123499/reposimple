import { Component, OnInit } from '@angular/core';
import { AddclassesService } from 'src/app/services/addclasses.service';

@Component({
  selector: 'app-showclasses',
  templateUrl: './showclasses.component.html',
  styleUrls: ['./showclasses.component.css']
})
export class ShowclassesComponent implements OnInit {

  classrooms:any;
  classroom={
    classname:''
  }

  constructor(private classlogin:AddclassesService) { }

  ngOnInit(): void {
    this.classlogin.getclass().subscribe(
      (data:any)=>{
       this.classrooms=data;
       console.log(this.classrooms)
      },
      (error)=>{
        console.log("error while getting data");
      }
    )
  }

}
