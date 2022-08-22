import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Expelab } from '../model/expelab';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class SExperienciaService {
  expURL = 'http://localhost:8080/explab/'

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Expelab[]>{
    return this.httpClient.get<Expelab[]>(this.expURL + 'lista');
  }

  public detail(id: number): Observable<Expelab>{
    return this.httpClient.get<Expelab>(this.expURL + `detail/${id}`)
  }

  public save(expelab: Expelab): Observable<any>{
    return this.httpClient.post<any>(this.expURL + `create`, expelab);
    }

    public update(id: number, expelab: Expelab): Observable<any>{
      return this.httpClient.put<any>(this.expURL + `update/${id}`,expelab);
    }

    public delete(id: number): Observable<any>{
      return this.httpClient.delete<any>(this.expURL + `delete/${id}`);
    }
}
