import {Component} from '@angular/core';
import {FormBuilder} from '@angular/forms';

@Component({
    selector: 'app-deals-form',
    template: `<h2>Edit deals</h2>
    <form [formGroup]="form"><input pInputText formControlName="name" placeholder="Name"/></form>`
})
export class DealFormComponent {
    readonly form = this.createForm();

    constructor(private readonly fb: FormBuilder) {
    }

    private createForm() {
        return this.fb.nonNullable.group({
            name: ['']
        });
    }
}
