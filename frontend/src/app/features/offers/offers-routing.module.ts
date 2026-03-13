import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {OfferListComponent} from './offers-list.component';
import {OfferFormComponent} from './offers-form.component';

const routes: Routes = [
    {path: '', component: OfferListComponent},
    {path: 'new', component: OfferFormComponent},
    {path: ':id', component: OfferFormComponent}
];

@NgModule({imports: [RouterModule.forChild(routes)], exports: [RouterModule]})
export class OffersRoutingModule {
}
