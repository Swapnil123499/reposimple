import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { AddclassesService } from 'src/app/services/addclasses.service';
import { SubjectsService } from 'src/app/services/subjects.service';

@Component({
  selector: 'app-addsubject',
  templateUrl: './addsubject.component.html',
  styleUrls: ['./addsubject.component.css']
})
export class AddsubjectComponent implements OnInit {
  classrooms:any;
  subjects={
    subname:'',
    classr:{
      cid:''
    }

  }
  constructor(private service:SubjectsService,
               private classservice:AddclassesService,
               private _snack:MatSnackBar
    ) { }

  ngOnInit(): void {
    this.classservice.getclass().subscribe(
      (data:any)=>{
        this.classrooms=data;
      },
      (error)=>{
        console.log(error);
      }
    )
  }

  formSubmit(){
    if(this.subjects.subname.trim()==''||this.subjects.subname==null)
    {
      this._snack.open('student name required!!','',{
        duration:3000
      });
      return;
    }

    this.service.addsubject(this.subjects).subscribe(
      (data:any)=>{
        
        this._snack.open('subject added !!','',{
          duration:3000
        });
      },
      (error)=>{
        console.log(error);
      }
    )

  }

}
