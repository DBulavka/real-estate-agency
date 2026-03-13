import { Component } from '@angular/core';

@Component({
  selector: 'app-main-layout',
  template: `
    <div class="layout">
      <aside class="sidebar">
        <h3>Agency CRM</h3>
        <nav>
          <p><a routerLink="/clients">Клиенты</a></p>
          <p><a routerLink="/properties">Объекты</a></p>
          <p><a routerLink="/deals">Сделки</a></p>
          <p><a routerLink="/viewings">Показы</a></p>
          <p><a routerLink="/offers">Офферы</a></p>
          <p><a routerLink="/users">Пользователи</a></p>
        </nav>
      </aside>
      <main class="content">
        <router-outlet></router-outlet>
      </main>
    </div>
  `
})
export class MainLayoutComponent {}
