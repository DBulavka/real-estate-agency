import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ReactiveFormsModule} from '@angular/forms';
import {TableModule} from 'primeng/table';
import {InputTextModule} from 'primeng/inputtext';
import {DealsRoutingModule} from './deals-routing.module';
import {DealListComponent} from './deals-list.component';
import {DealFormComponent} from './deals-form.component';

@NgModule({
    declarations: [DealListComponent, DealFormComponent],
    imports: [CommonModule, ReactiveFormsModule, TableModule, InputTextModule, DealsRoutingModule]
})
export class DealsModule {
}
