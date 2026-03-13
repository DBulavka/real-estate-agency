import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-viewings-form',
  template: `<h2>Edit viewings</h2><form [formGroup]="form"><input pInputText formControlName="name" placeholder="Name"/></form>`
})
export class ViewingFormComponent {
  form = this.fb.group({ name: [''] });
  constructor(private readonly fb: FormBuilder) {}
}
