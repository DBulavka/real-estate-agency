import {Injectable} from '@angular/core';
import {CanActivate, Router} from '@angular/router';
import {AuthService} from '../auth/auth.service';

@Injectable({providedIn: 'root'})
export class AuthGuard implements CanActivate {
    constructor(private authService: AuthService, private router: Router) {
    }

    canActivate(): boolean {
        return true;
        if (this.authService.isAuthenticated()) {
            return true;
        }
        this.authService.loginWithGoogle();
        return false;
    }
}
