import { Component, OnInit } from '@angular/core';
import { UsersService } from './users.service';
import { User } from './users.model';

@Component({
  selector: 'app-users-list',
  template: `<h2>Users list</h2><p-table [value]="items"><ng-template pTemplate="header"><tr><th>ID</th></tr></ng-template><ng-template pTemplate="body" let-item><tr><td>{{item.id}}</td></tr></ng-template></p-table>`
})
export class UserListComponent implements OnInit {
  items: User[] = [];
  constructor(private readonly service: UsersService) {}
  ngOnInit(): void { this.service.list().subscribe(data => this.items = data); }
}
