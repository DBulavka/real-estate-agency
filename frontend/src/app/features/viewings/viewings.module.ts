import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { TableModule } from 'primeng/table';
import { InputTextModule } from 'primeng/inputtext';
import { ViewingsRoutingModule } from './viewings-routing.module';
import { ViewingListComponent } from './viewings-list.component';
import { ViewingFormComponent } from './viewings-form.component';

@NgModule({
  declarations: [ViewingListComponent, ViewingFormComponent],
  imports: [CommonModule, ReactiveFormsModule, TableModule, InputTextModule, ViewingsRoutingModule]
})
export class ViewingsModule {}
