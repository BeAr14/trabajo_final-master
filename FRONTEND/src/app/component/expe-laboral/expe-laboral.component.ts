import { Component, OnInit } from '@angular/core';
import { Expelab } from 'src/app/model/expelab';
import { SExperienciaService } from 'src/app/servicios/s-experiencia.service';
import { TokenService } from 'src/app/servicios/token.service';


@Component({
  selector: 'app-expe-laboral',
  templateUrl: './expe-laboral.component.html',
  styleUrls: ['./expe-laboral.component.css']
})
export class ExpeLaboralComponent implements OnInit {
  expelab: Expelab[] = [];

  constructor(private sExperiencia: SExperienciaService, private tokenService: TokenService) { }

  isLogged = false;

  ngOnInit(): void {
    this.cargarExpelab();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarExpelab(): void {
    this.sExperiencia.lista().subscribe(
      data => { this.expelab = data; })
  }

  delete(id?: number) {
    if (id != undefined) {
      this.sExperiencia.delete(id).subscribe(
        data => {
          this.cargarExpelab();
        }, err => {
          alert("No se pudo borrar la experiencia");
        }
      )
    }
  }
}      



