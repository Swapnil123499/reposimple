import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { SubjectsService } from 'src/app/services/subjects.service';
import { TeachersService } from 'src/app/services/teachers.service';

@Component({
  selector: 'app-addteacher',
  templateUrl: './addteacher.component.html',
  styleUrls: ['./addteacher.component.css']
})
export class AddteacherComponent implements OnInit {
    subjects:any;
    teachers={
      tname:'',
      tphone:'',
      address:'',
      subjects:{
        subid:''
      }
    }
  constructor(private subservice:SubjectsService,
               private teaservice:TeachersService,
               private _snack:MatSnackBar) { }

  ngOnInit(): void {
    this.subservice.getsubject().subscribe(
      (data:any)=>{
        this.subjects=data;
        console.log(data);
      },
      (error)=>{
        console.log(error);
      }
    )
  }

  formSubmit(){
    this.teaservice.addteacher(this.teachers).subscribe(
      (data:any)=>{
        this._snack.open('Teacher added in class!!','',{
          duration:3000
        })
      },
      (error)=>{
        console.log(error);
      }
    )
  }

}
