import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { User } from 'src/app/model/User';
import { Village } from 'src/app/model/Village';

@Component({
  selector: 'app-userregistration',
  templateUrl: './userregistration.component.html',
  styleUrls: ['./userregistration.component.css']
})
export class UserregistrationComponent {

  url = 'http://localhost:8080';
  allvillageData:Village[]=[];
  constructor(private http: HttpClient) {
    this.http.get('http://localhost:8080/'+'getvillageData').subscribe(
      (data:any)=>{
        if(data==null)
        window.alert("exception on server");
      else
      this.allvillageData=data;
      }
    );
  }
  confirmPassword: string;
  registerUser: User = new User();
  a
  
  userRegister() {
    this.http
      .post(this.url + '/register', this.registerUser)
      .subscribe((data:any) => {
        if (data == false) window.alert('register not sussfull');
        else window.alert('register sussfull');
      });
  }

}
