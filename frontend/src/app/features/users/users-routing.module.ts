import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {UserListComponent} from './users-list.component';
import {UserFormComponent} from './users-form.component';

const routes: Routes = [
    {path: '', component: UserListComponent},
    {path: 'new', component: UserFormComponent},
    {path: ':id', component: UserFormComponent}
];

@NgModule({imports: [RouterModule.forChild(routes)], exports: [RouterModule]})
export class UsersRoutingModule {
}
