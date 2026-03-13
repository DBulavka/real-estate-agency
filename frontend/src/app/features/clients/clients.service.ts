import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BaseApiService } from '../../core/services/base-api.service';
import { Client } from './clients.model';

@Injectable({ providedIn: 'root' })
export class ClientsService extends BaseApiService<Client> {
  constructor(http: HttpClient) { super(http, 'http://localhost:8080/api/clients'); }
}
