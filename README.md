# 🏙️ CRUD Cidades

<div align="center">

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)
[![GitHub Last Commit](https://img.shields.io/github/last-commit/RodneyRicardo/crud-cidades?style=for-the-badge&color=blue)](https://github.com/RodneyRicardo/crud-cidades)

</div>

---

Uma aplicação web desenvolvida em Java com Spring Boot para o gerenciamento (Cadastro, Leitura, Atualização e Exclusão) de cidades. Projeto desenvolvido como parte integrante dos estudos da Pós-Graduação em Java da Universidade Tecnológica Federal do Paraná (UTFPR).

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring MVC / Thymeleaf**
- **PostgreSQL / H2 Database**
- **Apache Maven**
- **Bootstrap 5**

---

## 📌 Funcionalidades

- [x] **Cadastrar Cidades:** Registro de novas cidades com nome e estado (UF).
- [x] **Listar Cidades:** Visualização em tabela de todas as cidades cadastradas.
- [x] **Editar Cidade:** Atualização dos dados de cidades existentes.
- [x] **Excluir Cidade:** Remoção de registros do banco de dados.
- [x] **Validação de Dados:** Garantia de integridade com Jakarta Validation.

---

## 📂 Estrutura do Projeto

```text
crud-cidades/
├── src/
│   ├── main/
│   │   ├── java/com/utfpr/crudcidades/
│   │   │   ├── controller/     # Camada de controle (Endpoints / Views)
│   │   │   ├── dto/            # Data Transfer Objects
│   │   │   ├── model/          # Entidades JPA
│   │   │   ├── repository/     # Interfaces Spring Data JPA
│   │   │   └── service/        # Regras de negócio da aplicação
│   │   └── resources/
│   │       ├── templates/      # Páginas HTML (Thymeleaf)
│   │       └── application.yml # Configurações da aplicação e banco
│   └── test/                   # Testes unitários e de integração
├── .gitignore
├── pom.xml
└── README.md

🚀 Como Executar o Projeto Localmente
Pré-requisitos
Java JDK 17 ou superior instalado

Git instalado

VS Code ou IntelliJ IDEA

Passo a Passo
1. Clonar o repositório:

Bash

git clone [https://github.com/RodneyRicardo/crud-cidades.git](https://github.com/RodneyRicardo/crud-cidades.git)

2. Acessar a pasta do projeto:

Bash

cd crud-cidades

3. Executar a aplicação via Maven Wrapper
     - No macOS / Linux:

Bash

./mvnw spring-boot:run

    - No Windows

Bash

mvnw.cmd spring-boot:run

4. Acessar no navegador:
Abra http://localhost:8080 para interagir com a aplicação.

👤 Autor
Desenvolvido por Rodney Ricardo Joaquim(aula de Java Web)

    - GitHub: @RodneyRicardo

    - Pós-Graduação em Java — UTFPR
