import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SaveTicketComponent } from './save-ticket/save-ticket.component';
import { ChatComponent } from './chat/chat.component';


const routes: Routes = [
  { path : 'save' , component: SaveTicketComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [SaveTicketComponent , ChatComponent]
