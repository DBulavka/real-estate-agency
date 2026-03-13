import {Component} from '@angular/core';
import {FormBuilder} from '@angular/forms';

@Component({
    selector: 'app-clients-form',
    template: `<h2>Edit clients</h2>
    <form [formGroup]="form"><input pInputText formControlName="name" placeholder="Name"/></form>`
})
export class ClientFormComponent {
    readonly form = this.createForm();

    constructor(private readonly fb: FormBuilder) {
    }

    private createForm() {
        return this.fb.nonNullable.group({
            name: ['']
        });
    }
}
