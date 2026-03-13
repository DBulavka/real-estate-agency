import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ViewingListComponent} from './viewings-list.component';
import {ViewingFormComponent} from './viewings-form.component';

const routes: Routes = [
    {path: '', component: ViewingListComponent},
    {path: 'new', component: ViewingFormComponent},
    {path: ':id', component: ViewingFormComponent}
];

@NgModule({imports: [RouterModule.forChild(routes)], exports: [RouterModule]})
export class ViewingsRoutingModule {
}
