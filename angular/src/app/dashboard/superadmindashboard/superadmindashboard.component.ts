import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Village } from 'src/app/model/Village';

@Component({
  selector: 'app-superadmindashboard',
  templateUrl: './superadmindashboard.component.html',
  styleUrls: ['./superadmindashboard.component.css']
})
export class SuperadmindashboardComponent {

  constructor(private http:HttpClient){}

  

  addVillage(){
    this.http.post('http://localhost:8080/'+'addvillageData',)
  }

}
