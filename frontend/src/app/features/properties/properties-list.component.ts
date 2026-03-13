import {Component, OnInit} from '@angular/core';
import {PropertysService} from './properties.service';
import {Property} from './properties.model';

@Component({
    selector: 'app-properties-list',
    template: `<h2>Properties list</h2>
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
export class PropertyListComponent implements OnInit {
    items: Property[] = [];

    constructor(private readonly service: PropertysService) {
    }

    ngOnInit(): void {
        this.service.list().subscribe(data => this.items = data);
    }
}
