# TaskFlow

API REST para gerenciamento de tarefas, desenvolvida com Java e Spring Boot.

O projeto foi desenvolvido como parte do meu portfólio de Engenharia de Software, com foco no aprendizado e aplicação de conceitos de desenvolvimento backend, APIs REST, persistência de dados e arquitetura em camadas.

## 🚀 Tecnologias

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Jakarta Validation
- SpringDoc OpenAPI / Swagger

## 🏗️ Arquitetura

O projeto utiliza uma arquitetura organizada em camadas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL
Controller

Responsável por receber as requisições HTTP e disponibilizar os endpoints da API.

Service

Responsável pelas regras de negócio e pelo gerenciamento das operações realizadas nas tarefas.

Repository

Responsável pela comunicação com o banco de dados através do Spring Data JPA.

Entity

Representa a entidade Tarefa armazenada no banco de dados.

📋 Funcionalidades
Criar tarefas
Listar todas as tarefas
Atualizar tarefas
Excluir tarefas
Validação dos dados recebidos
Tratamento de erros
Persistência de dados em PostgreSQL
Documentação interativa com Swagger
🔌 Endpoints
Método	Endpoint	Descrição
POST	/tarefas	Criar uma tarefa
GET	/tarefas	Listar todas as tarefas
PUT	/tarefas/{id}	Atualizar uma tarefa
DELETE	/tarefas/{id}	Excluir uma tarefa
📝 Exemplo de requisição
Criar tarefa
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Aprender desenvolvimento de APIs REST",
  "concluida": false
}
Resposta
{
  "id": 1,
  "titulo": "Estudar Spring Boot",
  "descricao": "Aprender desenvolvimento de APIs REST",
  "concluida": false
}
📖 Documentação da API

O projeto utiliza Swagger/OpenAPI para documentação e testes dos endpoints.

Com a aplicação em execução, acesse:

http://localhost:8080/swagger-ui.html
🗄️ Banco de dados

O TaskFlow utiliza PostgreSQL para persistência dos dados.

A senha do banco não fica armazenada diretamente no código. O projeto utiliza a variável de ambiente:

DB_PASSWORD

Configuração utilizada:

spring.datasource.url=jdbc:postgresql://localhost:5432/taskflow
spring.datasource.username=postgres
spring.datasource.password=${DB_PASSWORD}
▶️ Como executar
Pré-requisitos
Java 21
PostgreSQL
Git
1. Clone o projeto
git clone https://github.com/SEU-USUARIO/taskflow.git
2. Crie o banco de dados

No PostgreSQL, crie um banco chamado:

taskflow
3. Configure a variável de ambiente

Configure a variável:

DB_PASSWORD

com a senha do seu usuário do PostgreSQL.

4. Execute a aplicação

No Windows:

.\mvnw.cmd spring-boot:run

A API será executada em:

http://localhost:8080
🎯 Objetivos de aprendizado

Este projeto foi desenvolvido para colocar em prática:

Desenvolvimento de APIs REST
Java e Spring Boot
Arquitetura em camadas
Spring Data JPA
Hibernate
PostgreSQL
Operações CRUD
Validação de dados
Tratamento de exceções
Documentação de APIs
Controle de versão com Git
👨‍💻 Autor

Gustavo Gonçalves do Prado

Estudante de Engenharia de Software