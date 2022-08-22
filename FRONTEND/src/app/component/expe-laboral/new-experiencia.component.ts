import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Expelab } from 'src/app/model/expelab';
import { SExperienciaService } from 'src/app/servicios/s-experiencia.service';


@Component({
  selector: 'app-new-experiencia',
  templateUrl: './new-experiencia.component.html',
  styleUrls: ['./new-experiencia.component.css'],
  
})
export class NewExperienciaComponent implements OnInit {
  nombreEx: string = '';
  descripcionEx: string = '';
  

  constructor(private sExperiencia: SExperienciaService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void{
    const expelab = new Expelab(this.nombreEx, this.descripcionEx);
    this.sExperiencia.save(expelab).subscribe(data => {alert("Experiencia añadida");
    this.router.navigate(['']);
  }, err =>{ 
    alert("Falló");
    this.router.navigate(['']);
});
    
  }

}
