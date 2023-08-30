import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserregistrationComponent } from './userregistration/userregistration.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    UserloginComponent,
    UserregistrationComponent
  ],
  imports: [
    CommonModule
    ,FormsModule
  ],
  exports:[
     UserloginComponent,
    UserregistrationComponent
  ]
})
export class LoginModule { }
