import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BaseApiService } from '../../core/services/base-api.service';
import { Property } from './properties.model';

@Injectable({ providedIn: 'root' })
export class PropertysService extends BaseApiService<Property> {
  constructor(http: HttpClient) { super(http, 'http://localhost:8080/api/properties'); }
}
