import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

export class BaseApiService<T> {
    constructor(protected readonly http: HttpClient, private readonly path: string) {
    }

    list(): Observable<T[]> {
        return this.http.get<T[]>(this.path);
    }

    get(id: number): Observable<T> {
        return this.http.get<T>(`${this.path}/${id}`);
    }

    create(payload: T): Observable<T> {
        return this.http.post<T>(this.path, payload);
    }

    update(id: number, payload: T): Observable<T> {
        return this.http.put<T>(`${this.path}/${id}`, payload);
    }
}
