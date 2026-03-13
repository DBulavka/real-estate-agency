import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BaseApiService} from '../../core/services/base-api.service';
import {Viewing} from './viewings.model';

@Injectable({providedIn: 'root'})
export class ViewingsService extends BaseApiService<Viewing> {
    constructor(http: HttpClient) {
        super(http, 'http://localhost:8080/api/viewings');
    }
}
