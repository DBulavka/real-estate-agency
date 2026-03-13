import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ReactiveFormsModule} from '@angular/forms';
import {TableModule} from 'primeng/table';
import {InputTextModule} from 'primeng/inputtext';
import {OffersRoutingModule} from './offers-routing.module';
import {OfferListComponent} from './offers-list.component';
import {OfferFormComponent} from './offers-form.component';

@NgModule({
    declarations: [OfferListComponent, OfferFormComponent],
    imports: [CommonModule, ReactiveFormsModule, TableModule, InputTextModule, OffersRoutingModule]
})
export class OffersModule {
}
