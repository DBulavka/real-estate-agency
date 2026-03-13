import {Injectable} from '@angular/core';

@Injectable({providedIn: 'root'})
export class AuthService {
    loginWithGoogle(): void {
        window.location.href = 'http://localhost:8080/oauth2/authorization/google';
    }

    isAuthenticated(): boolean {
        return Boolean(localStorage.getItem('access_token'));
    }

    getRoles(): string[] {
        return JSON.parse(localStorage.getItem('roles') ?? '[]');
    }
}
