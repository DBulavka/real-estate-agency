import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ReactiveFormsModule} from '@angular/forms';
import {TableModule} from 'primeng/table';
import {InputTextModule} from 'primeng/inputtext';
import {UsersRoutingModule} from './users-routing.module';
import {UserListComponent} from './users-list.component';
import {UserFormComponent} from './users-form.component';

@NgModule({
    declarations: [UserListComponent, UserFormComponent],
    imports: [CommonModule, ReactiveFormsModule, TableModule, InputTextModule, UsersRoutingModule]
})
export class UsersModule {
}
