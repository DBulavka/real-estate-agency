import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-users-form',
  template: `<h2>Edit users</h2><form [formGroup]="form"><input pInputText formControlName="name" placeholder="Name"/></form>`
})
export class UserFormComponent {
  form = this.fb.group({ name: [''] });
  constructor(private readonly fb: FormBuilder) {}
}
