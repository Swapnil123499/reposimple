import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { AddclassesService } from 'src/app/services/addclasses.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-addclass',
  templateUrl: './addclass.component.html',
  styleUrls: ['./addclass.component.css']
})
export class AddclassComponent implements OnInit {

  classroom={
    classname:'',
  }

  constructor(private addclasses:AddclassesService,
             private _snack:MatSnackBar) { }

  ngOnInit(): void {
    
  }
  formSubmit(){
     if(this.classroom.classname.trim()==''||this.classroom.classname==null){
      this._snack.open('Tital Required!!','',{
        duration:3000
      });
      return;
     }
     
     this.addclasses.addclass(this.classroom).subscribe(
      (data:any)=>{
        this.classroom.classname='';
        Swal.fire('success!!','classroom added succesfuly','success');

      },
      (error)=>{
        Swal.fire('error','class not added somthing went wrong','error');
      }
     )

}
}
