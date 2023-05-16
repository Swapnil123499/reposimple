import {  NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { HomeComponent } from './components/home/home.component';
import { AddclassComponent } from './components/Admin/addclass/addclass.component';
import { AddstudentComponent } from './components/Admin/addstudent/addstudent.component';
import { AddsubjectComponent } from './components/Admin/addsubject/addsubject.component';
import { AddteacherComponent } from './components/Admin/addteacher/addteacher.component';
import { AdmindashboardComponent } from './components/Admin/admindashboard/admindashboard.component';

import { LoginComponent } from './components/logandreg/login/login.component';
import { RegisterComponent } from './components/logandreg/register/register.component';
import { UserdashboardComponent } from './components/normal/userdashboard/userdashboard.component';
import { AdminGuard } from './services/admin.guard';
import { ShowstudentComponent } from './components/normal/showstudent/showstudent.component';
import { ShowclassesComponent } from './components/normal/showclasses/showclasses.component';
import { ShowsubjectComponent } from './components/normal/showsubject/showsubject.component';
import { ShowteacherComponent } from './components/normal/showteacher/showteacher.component';



const routes: Routes = [
  {
    path:"about",
    component:AboutusComponent
  },
  {
    path:"",
    component:HomeComponent
  },
  {
    path:'login',
    component:LoginComponent,
  
  },
  {
path:'signup',
component:RegisterComponent
  },
  {
    path:'admin',
    component:AdmindashboardComponent,
    
    canActivate:[AdminGuard],
    children:[
      {
          path:'addclass',
          component:AddclassComponent
      },
      {
        path:'addstudent',
        component:AddstudentComponent
      },
      {
        path:'addsubject',
        component:AddsubjectComponent
      },
      {
        path:'addteacher',
        component:AddteacherComponent
      }
    ]
  },
  {
    path:'user-dashboard',
    component:UserdashboardComponent,

    children:[
      {
        path:'class',
        component:ShowclassesComponent
      },
      {
        path:'student/:cid/:classname',
        component:ShowstudentComponent
      },
      {
        path:'subject/:cid/:classname',
        component:ShowsubjectComponent
      }
      ,
      {
        path:'teachers/:subid/:subname',
        component:ShowteacherComponent
      }
    ]
  }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
