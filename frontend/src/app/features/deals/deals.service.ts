import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BaseApiService } from '../../core/services/base-api.service';
import { Deal } from './deals.model';

@Injectable({ providedIn: 'root' })
export class DealsService extends BaseApiService<Deal> {
  constructor(http: HttpClient) { super(http, 'http://localhost:8080/api/deals'); }
}
