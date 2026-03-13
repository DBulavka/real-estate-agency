import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router} from '@angular/router';
import {AuthService} from '../auth/auth.service';

@Injectable({providedIn: 'root'})
export class RoleGuard implements CanActivate {
    constructor(private authService: AuthService, private router: Router) {
    }

    canActivate(route: ActivatedRouteSnapshot): boolean {
        const allowed = route.data['roles'] as string[];
        const currentRoles = this.authService.getRoles();
        const access = allowed.some(role => currentRoles.includes(role));
        if (!access) {
            this.router.navigateByUrl('/clients');
        }
        return access;
    }
}
