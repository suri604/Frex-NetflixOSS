import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class TicketServiceService {

  private _url :string= "http://localhost:8062/api/v1/saveTicket";
  constructor(private http: HttpClient) { }

  getRepo() : Observable<any>
  {
    return this.http.get<any>(this._url);

  }

 saveTicket( ticketNumber: Number, price: Number , date: String , distance: Number)
  {
     console.log("hello");
     return this.http.post(this._url,
      {
      // "id":id,
      // "repoName":repoName,
      // "createdAt":createdAt
      "ticketNumber" : ticketNumber,
      "price" : price,
      "date" : date,
      "distance" : distance
    }
      )
  }
}
