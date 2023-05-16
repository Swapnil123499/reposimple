import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { StudentsService } from 'src/app/services/students.service';

@Component({
  selector: 'app-showstudent',
  templateUrl: './showstudent.component.html',
  styleUrls: ['./showstudent.component.css']
})
export class ShowstudentComponent implements OnInit {
   cid:any;
   students:any;
   classname:any;
    
  constructor(private stdlog:StudentsService,private activerout:ActivatedRoute) { }

  ngOnInit(): void {
   this.cid = this.activerout.snapshot.params['cid'];
     console.log(this.cid);
     this.classname=this.activerout.snapshot.params['classname'];
     
     this.stdlog.getstudentinclass(this.cid).subscribe(
    (data:any)=>{
   this.students=data;
   console.log(this.students);
    }
   )

  }

}
