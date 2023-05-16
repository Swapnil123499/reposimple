import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { TeachersService } from 'src/app/services/teachers.service';

@Component({
  selector: 'app-showteacher',
  templateUrl: './showteacher.component.html',
  styleUrls: ['./showteacher.component.css']
})
export class ShowteacherComponent implements OnInit {
  subid:any;
  subname:any;
  teachers:any;
  constructor(private Activatedrout:ActivatedRoute,private logteach:TeachersService) { }

  ngOnInit(): void {
    this.subid=this.Activatedrout.snapshot.params['subid']
    console.log(this.subid);
    this.subname=this.Activatedrout.snapshot.params['subname'];
    console.log(this.subname);
    
    this.logteach.getteachersinsubject(this.subid).subscribe((data)=>{
      this.teachers=data;
    },
    (error)=>{
      console.log(error);
    })
  }

}
