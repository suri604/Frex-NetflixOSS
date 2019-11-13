import { Component, OnInit } from '@angular/core';
import { TicketServiceService } from '../ticket-service.service';

@Component({
  selector: 'app-save-ticket',
  templateUrl: './save-ticket.component.html',
  styleUrls: ['./save-ticket.component.css']
})
export class SaveTicketComponent implements OnInit {

  
  constructor( private ticketService: TicketServiceService) { }

  ngOnInit() {
  }
  saveTicket(ticketNumber, price, date , distance) {
    this.ticketService.saveTicket(ticketNumber, price, date , distance).subscribe(data => {
      console.log(data);
    });
  }
  url:any;
  
onSelectFile(event) { // called each time file input changes
    if (event.target.files && event.target.files[0]) {
      var reader = new FileReader();

      reader.readAsDataURL(event.target.files[0]); // read file as data url

      reader.onload = (event) => { // called once readAsDataURL is completed
        this.url = event.target.result;
      }
    }
}

}
