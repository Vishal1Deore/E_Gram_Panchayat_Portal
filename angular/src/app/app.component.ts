import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular';
  whatToShow=0;
  isloginsuccess=0;
  btnShow(num: number){
    this.whatToShow=num;
    
  }
}
