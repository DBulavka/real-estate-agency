import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-properties-form',
  template: `<h2>Edit properties</h2><form [formGroup]="form"><input pInputText formControlName="name" placeholder="Name"/></form>`
})
export class PropertyFormComponent {
  form = this.fb.group({ name: [''] });
  constructor(private readonly fb: FormBuilder) {}
}
