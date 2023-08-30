import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SuperadmindashboardComponent } from './superadmindashboard/superadmindashboard.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';



@NgModule({
  declarations: [
    SuperadmindashboardComponent,
    AdmindashboardComponent,
    UserdashboardComponent
  ],
  imports: [
    CommonModule
  ]
})
export class DashboardModule { }
