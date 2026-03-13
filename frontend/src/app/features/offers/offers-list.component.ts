import { Component, OnInit } from '@angular/core';
import { OffersService } from './offers.service';
import { Offer } from './offers.model';

@Component({
  selector: 'app-offers-list',
  template: `<h2>Offers list</h2><p-table [value]="items"><ng-template pTemplate="header"><tr><th>ID</th></tr></ng-template><ng-template pTemplate="body" let-item><tr><td>{{item.id}}</td></tr></ng-template></p-table>`
})
export class OfferListComponent implements OnInit {
  items: Offer[] = [];
  constructor(private readonly service: OffersService) {}
  ngOnInit(): void { this.service.list().subscribe(data => this.items = data); }
}
