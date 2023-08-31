import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { User } from 'src/app/model/User';
import { Village } from 'src/app/model/Village';

@Component({
  selector: 'app-superadmindashboard',
  templateUrl: './superadmindashboard.component.html',
  styleUrls: ['./superadmindashboard.component.css']
})
export class SuperadmindashboardComponent {

  constructor(private http:HttpClient){}

  allUnverifieduser:User[]=[];
  getDataOfuser(){

    this.http.get('http://localhost:8080/'+'getunverifieduserData').subscribe(
      (data:any)=>{
        if(data==null)
        window.alert("exception on server")
      else
      this.allUnverifieduser=data;})
  
      
    ;}
  
village:Village=new Village();
  addVillage(){
    this.http.post('http://localhost:8080/'+'addvillageData',this.village).subscribe(
        (data:any)=>
        {
          if(data==false)
          window.alert("exception on server")
        else
        window.alert("added successully");
      this.village=new Village();
        }
    );
  }

  whatToShow=0;
  show(num:number){
    this.whatToShow=num;
  }
  



}
