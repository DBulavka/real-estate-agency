import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {PropertyListComponent} from './properties-list.component';
import {PropertyFormComponent} from './properties-form.component';

const routes: Routes = [
    {path: '', component: PropertyListComponent},
    {path: 'new', component: PropertyFormComponent},
    {path: ':id', component: PropertyFormComponent}
];

@NgModule({imports: [RouterModule.forChild(routes)], exports: [RouterModule]})
export class PropertysRoutingModule {
}
