# Real Estate Agency Template

Монорепозиторий с двумя подпроектами:

- `backend` — Spring Boot 4 + PostgreSQL + Liquibase, архитектура repository/service/controller с раздельными моделями слоёв и MapStruct для маппинга.
- `frontend` — Angular + PrimeNG, OAuth2 Google login, меню навигации, role-based маршрутизация и CRUD-экраны (list/form) для всех backend-сущностей.

## Сущности полного цикла сделки

1. **AgencyUser** — сотрудники агентства и роли доступа.
2. **Client** — покупатели/продавцы и ответственный агент.
3. **Property** — карточка объекта и статус публикации.
4. **Viewing** — показы объекта клиентам.
5. **Offer** — ценовые предложения и их статусы.
6. **Deal** — завершение процесса покупки/продажи.

## Запуск

### Backend

```bash
cd backend
./gradlew bootRun
```

### Frontend

```bash
cd frontend
npm install
npm start
```
