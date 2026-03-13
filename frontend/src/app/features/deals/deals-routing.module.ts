import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {DealListComponent} from './deals-list.component';
import {DealFormComponent} from './deals-form.component';

const routes: Routes = [
    {path: '', component: DealListComponent},
    {path: 'new', component: DealFormComponent},
    {path: ':id', component: DealFormComponent}
];

@NgModule({imports: [RouterModule.forChild(routes)], exports: [RouterModule]})
export class DealsRoutingModule {
}
