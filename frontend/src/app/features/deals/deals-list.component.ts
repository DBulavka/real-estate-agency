import { Component, OnInit } from '@angular/core';
import { DealsService } from './deals.service';
import { Deal } from './deals.model';

@Component({
  selector: 'app-deals-list',
  template: `<h2>Deals list</h2><p-table [value]="items"><ng-template pTemplate="header"><tr><th>ID</th></tr></ng-template><ng-template pTemplate="body" let-item><tr><td>{{item.id}}</td></tr></ng-template></p-table>`
})
export class DealListComponent implements OnInit {
  items: Deal[] = [];
  constructor(private readonly service: DealsService) {}
  ngOnInit(): void { this.service.list().subscribe(data => this.items = data); }
}
