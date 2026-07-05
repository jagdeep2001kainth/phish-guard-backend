\# ⚙️ PhishGuard — Spring Boot Backend



REST API gateway that connects the React frontend to the Flask ML service.

Part of the \[PhishGuard](https://github.com/jagdeep2001kainth/phish-guard-frontend) project.



\## Endpoints

| Method | Route | Description |

|--------|-------|-------------|

| GET | `/api/health` | Health check |

| POST | `/api/scan-email` | Scan email for phishing |



\## Tech Stack

\- Java 17, Spring Boot, REST API, Maven



\## Running Locally

```bash

./mvnw spring-boot:run

```



\## Environment Variables

| Variable | Description |

|----------|-------------|

| `ML\_SERVICE\_URL` | URL of the Flask ML service |



\## Part of PhishGuard

\- Frontend: \[phish-guard-frontend](https://github.com/jagdeep2001kainth/phish-guard-frontend)

\- ML Service: \[phish-guard-ml-service](https://github.com/jagdeep2001kainth/phish-guard-ml-service)

