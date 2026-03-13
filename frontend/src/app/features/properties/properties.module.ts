import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { TableModule } from 'primeng/table';
import { InputTextModule } from 'primeng/inputtext';
import { PropertysRoutingModule } from './properties-routing.module';
import { PropertyListComponent } from './properties-list.component';
import { PropertyFormComponent } from './properties-form.component';

@NgModule({
  declarations: [PropertyListComponent, PropertyFormComponent],
  imports: [CommonModule, ReactiveFormsModule, TableModule, InputTextModule, PropertysRoutingModule]
})
export class PropertysModule {}
