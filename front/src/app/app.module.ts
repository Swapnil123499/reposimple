import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';
import { NavbarComponent } from './components/navbar/navbar.component';

import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {MatSnackBarModule} from '@angular/material/snack-bar';

import {MatCardModule} from '@angular/material/card';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatSelectModule} from '@angular/material/select';
import { CKEditorModule } from '@ckeditor/ckeditor5-angular';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { HomeComponent } from './components/home/home.component';
import { AddclassComponent } from './components/Admin/addclass/addclass.component';
import { AddstudentComponent } from './components/Admin/addstudent/addstudent.component';
import { AddsubjectComponent } from './components/Admin/addsubject/addsubject.component';
import { AddteacherComponent } from './components/Admin/addteacher/addteacher.component';
import { LoginComponent } from './components/logandreg/login/login.component';
import { RegisterComponent } from './components/logandreg/register/register.component';
import { AdmindashboardComponent } from './components/Admin/admindashboard/admindashboard.component';
import { UserdashboardComponent } from './components/normal/userdashboard/userdashboard.component';
import { authInterceptorProviders } from './services/auth.interceptor';
import { ShowstudentComponent } from './components/normal/showstudent/showstudent.component';
import { ShowclassesComponent } from './components/normal/showclasses/showclasses.component';
import { ShowsubjectComponent } from './components/normal/showsubject/showsubject.component';
import { ShowteacherComponent } from './components/normal/showteacher/showteacher.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AboutusComponent,
    HomeComponent,
    AddclassComponent,
    AddstudentComponent,
    AddsubjectComponent,
    AddteacherComponent,
    LoginComponent,
    RegisterComponent,
    AdmindashboardComponent,
    UserdashboardComponent,
    ShowstudentComponent,
    ShowclassesComponent,
    ShowsubjectComponent,
    ShowteacherComponent,
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,
    HttpClientModule,
    MatSnackBarModule,
    MatCardModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    MatSlideToggleModule,
    MatSelectModule,
    CKEditorModule
    
    
  ],
   providers:[authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
