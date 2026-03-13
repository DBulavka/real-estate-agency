import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { TableModule } from 'primeng/table';
import { InputTextModule } from 'primeng/inputtext';
import { ClientsRoutingModule } from './clients-routing.module';
import { ClientListComponent } from './clients-list.component';
import { ClientFormComponent } from './clients-form.component';

@NgModule({
  declarations: [ClientListComponent, ClientFormComponent],
  imports: [CommonModule, ReactiveFormsModule, TableModule, InputTextModule, ClientsRoutingModule]
})
export class ClientsModule {}
