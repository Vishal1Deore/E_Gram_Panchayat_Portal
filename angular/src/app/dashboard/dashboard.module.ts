import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SuperadmindashboardComponent } from './superadmindashboard/superadmindashboard.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    SuperadmindashboardComponent,
    AdmindashboardComponent,
    UserdashboardComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports :[
    SuperadmindashboardComponent,
    AdmindashboardComponent,
    UserdashboardComponent

  ]
})
export class DashboardModule { }
