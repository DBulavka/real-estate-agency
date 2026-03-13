import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BaseApiService } from '../../core/services/base-api.service';
import { User } from './users.model';

@Injectable({ providedIn: 'root' })
export class UsersService extends BaseApiService<User> {
  constructor(http: HttpClient) { super(http, 'http://localhost:8080/api/users'); }
}
