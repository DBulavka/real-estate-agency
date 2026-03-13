import { Component, OnInit } from '@angular/core';
import { ViewingsService } from './viewings.service';
import { Viewing } from './viewings.model';

@Component({
  selector: 'app-viewings-list',
  template: `<h2>Viewings list</h2><p-table [value]="items"><ng-template pTemplate="header"><tr><th>ID</th></tr></ng-template><ng-template pTemplate="body" let-item><tr><td>{{item.id}}</td></tr></ng-template></p-table>`
})
export class ViewingListComponent implements OnInit {
  items: Viewing[] = [];
  constructor(private readonly service: ViewingsService) {}
  ngOnInit(): void { this.service.list().subscribe(data => this.items = data); }
}
