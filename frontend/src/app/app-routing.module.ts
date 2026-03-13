import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AuthGuard} from './core/guards/auth.guard';
import {RoleGuard} from './core/guards/role.guard';

const routes: Routes = [
    {path: '', redirectTo: 'clients', pathMatch: 'full'},
    {
        path: 'clients',
        loadChildren: () => import('./features/clients/clients.module').then(m => m.ClientsModule),
        canActivate: [AuthGuard]
    },
    {
        path: 'properties',
        loadChildren: () => import('./features/properties/properties.module').then(m => m.PropertiesModule),
        canActivate: [AuthGuard]
    },
    {
        path: 'deals',
        loadChildren: () => import('./features/deals/deals.module').then(m => m.DealsModule),
        canActivate: [AuthGuard]
    },
    {
        path: 'viewings',
        loadChildren: () => import('./features/viewings/viewings.module').then(m => m.ViewingsModule),
        canActivate: [AuthGuard]
    },
    {
        path: 'offers',
        loadChildren: () => import('./features/offers/offers.module').then(m => m.OffersModule),
        canActivate: [AuthGuard]
    },
    {
        path: 'users',
        loadChildren: () => import('./features/users/users.module').then(m => m.UsersModule),
        canActivate: [AuthGuard, RoleGuard],
        data: {roles: ['ADMIN', 'BROKER']}
    }
];

@NgModule({imports: [RouterModule.forRoot(routes)], exports: [RouterModule]})
export class AppRoutingModule {
}
