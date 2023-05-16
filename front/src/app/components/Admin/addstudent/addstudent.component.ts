import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { AddclassesService } from 'src/app/services/addclasses.service';
import { StudentsService } from 'src/app/services/students.service';

@Component({
  selector: 'app-addstudent',
  templateUrl: './addstudent.component.html',
  styleUrls: ['./addstudent.component.css']
})
export class AddstudentComponent implements OnInit {
  classrooms:any;
  students={
    stdname:'',
    surname:'',
    address:'',
    number:'',
    classroom:{
      cid:''
    }
  }
  constructor(private _service:StudentsService,
              private _classservice:AddclassesService,
              private _snack:MatSnackBar) { }

  ngOnInit(): void {
     this._classservice.getclass().subscribe(
      (data:any)=>{
         this.classrooms=data;
         console.log(this.classrooms);
      },
      (error)=>{
        console.log(error);
       }
       )
        }

        formSubmit(){
            if(this.students.stdname.trim()==''||this.students.stdname==null)
            {
              this._snack.open('student name required!!','',{
                duration:3000
              });
              return;
            }
            if(this.students.surname.trim()==''||this.students.surname==null){
              this._snack.open('students surname required','',{
                duration:3000
              });
              return;
            }
             this._service.addstudent(this.students).subscribe(
              (data:any)=>{
               /* this.students={
                  stdname:'',
                  surname:'',
                  address:'',
                  number:'',
                  classroom:{
                    cid:''
                  }
                }*/
                this._snack.open('student added successfully','',{
                  duration:3000
                });
                
              },
              (error)=>{
                console.log(error);
              }
            )
           
        }

}
