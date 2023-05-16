import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SubjectsService } from 'src/app/services/subjects.service';

@Component({
  selector: 'app-showsubject',
  templateUrl: './showsubject.component.html',
  styleUrls: ['./showsubject.component.css']
})
export class ShowsubjectComponent implements OnInit {
  cid:any;
  classname:any;
  subjects:any;
  constructor(private activatedrout:ActivatedRoute,private logsub:SubjectsService) { }

  ngOnInit(): void {
    this.cid=this.activatedrout.snapshot.params['cid'];
    this.classname=this.activatedrout.snapshot.params['classname'];
    this.logsub.getsubjectinclass(this.cid).subscribe((data:any)=>{
      this.subjects=data;
    },
    (error)=>{
      console.log(error);
    })
  }

}
