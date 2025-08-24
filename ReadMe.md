## 🐞 `Spring Boot Hibernate N+1 Problem`

<br>

<div align="center">
<img src="./images/problem.png" alt="problem" width="600">
</div>

---

<div align="center">
<img src="./images/problem-swagger-ui.png" alt="swagger-ui" width="600">
</div>

---

<div align="center">
<img src="./images/problem-dockerize.png" alt="docker" width="600">
</div>

<br>

- ✅ This application is a Spring Boot project that focuses on demonstrating the Hibernate N+1 Select Problem - a common performance issue in ORM-based applications. It illustrates how N+1 problems occur during lazy loading of entity relationships and provides practical solutions using fetch joins, DTO projections, and MapStruct for efficient data transfer.

<br>

Used Technologies in The Project:

[![Java](https://img.shields.io/badge/java-17.0-000?style=for-the-badge&logo=openjdk&logoColor=white&color=FF9A00)](https://www.java.com/en/)
[![Spring Boot](https://img.shields.io/badge/spring%20boot-3.5.3-000?style=for-the-badge&logo=springboot&logoColor=white&color=6DB33F)](https://spring.io/)
[![Hibernate](https://img.shields.io/badge/hibernate-6.5-000?style=for-the-badge&logo=hibernate&logoColor=white&color=59666C)](https://hibernate.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15.2-000?style=for-the-badge&logo=postgresql&logoColor=white&color=4479A1)](https://www.postgresql.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.0-000?style=for-the-badge&logo=gradle&logoColor=white&color=02303A)](https://gradle.org/)
[![Docker](https://img.shields.io/badge/Docker-28.3-000?style=for-the-badge&logo=Docker&logoColor=white&color=2496ED)](https://docs.docker.com/)

<br>

### 🚀 Quick Start
#### Prerequisites
- Java 17+
- Docker & Docker Compose
- PostgreSQL 15.2

#### Database Configuration
- **URL:** `http://localhost:9090` (Adminer)
- **Database:** `problem_db` 
- **Username:** `postgres`
- **Password:** `postgres`

### Installation

```shell
git clone https://github.com/furkankayam/hibernate-n1-problem.git
cd hibernate-n1-problem
```

<br>

### Usage

```shell
docker-compose up
```

#### 3. Access endpoints

- Problem Service: `http://localhost:8080/swagger-ui/index.html`
- Database UI: `http://localhost:9090`

<br>

### 🛒 Problem API Endpoints

> 🔍 Get Posts Entity Graph
```bash
curl -X 'GET' \
  'http://localhost:8080/api/entity-graph' \
  -H 'accept: */*'
```

> 🔍 Get Posts Join Fetch
```bash
curl -X 'GET' \
  'http://localhost:8080/api/join-fetch' \
  -H 'accept: */*'
```


<br>

# License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details

Created by [Mehmet Furkan KAYA](https://www.linkedin.com/in/mehmet-furkan-kaya/)

