import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-deals-form',
  template: `<h2>Edit deals</h2><form [formGroup]="form"><input pInputText formControlName="name" placeholder="Name"/></form>`
})
export class DealFormComponent {
  form = this.fb.group({ name: [''] });
  constructor(private readonly fb: FormBuilder) {}
}
