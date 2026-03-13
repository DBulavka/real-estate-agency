import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BaseApiService } from '../../core/services/base-api.service';
import { Offer } from './offers.model';

@Injectable({ providedIn: 'root' })
export class OffersService extends BaseApiService<Offer> {
  constructor(http: HttpClient) { super(http, 'http://localhost:8080/api/offers'); }
}
