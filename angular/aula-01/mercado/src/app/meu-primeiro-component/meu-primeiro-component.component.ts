import { Component } from '@angular/core';
import { BannerComponent } from './banner/banner.component';

@Component({
  selector: 'app-meu-primeiro-component',
  standalone: true,
  imports: [BannerComponent],
  templateUrl: './meu-primeiro-component.component.html',
  styleUrl: './meu-primeiro-component.component.css'
})
export class MeuPrimeiroComponentComponent {
  public lastName:string= "";
  public name:string ="";

  public year: number = 2024;



  actionBtn1(){
    this.name = "Richard";
    this.lastName ="Janebo"
    this.year --
  }
  actionBtn2(){
    this.name = "";
    this.lastName="";

    this.year ++;
  }
}
