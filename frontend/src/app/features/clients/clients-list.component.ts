import {Component, OnInit} from '@angular/core';
import {ClientsService} from './clients.service';
import {Client} from './clients.model';

@Component({
    selector: 'app-clients-list',
    template: `<h2>Clients list</h2>
    <p-table [value]="items">
        <ng-template pTemplate="header">
            <tr>
                <th>ID</th>
            </tr>
        </ng-template>
        <ng-template pTemplate="body" let-item>
            <tr>
                <td>{{ item.id }}</td>
            </tr>
        </ng-template>
    </p-table>`
})
export class ClientListComponent implements OnInit {
    items: Client[] = [];

    constructor(private readonly service: ClientsService) {
    }

    ngOnInit(): void {
        this.service.list().subscribe(data => this.items = data);
    }
}
