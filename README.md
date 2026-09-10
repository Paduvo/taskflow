#  TaskFlow

API REST para gerenciamento de tarefas, desenvolvida com Java e Spring Boot.

O projeto foi criado com o objetivo de praticar desenvolvimento de APIs REST, persistência de dados, arquitetura em camadas, validação, DTOs, tratamento de erros, filtros e paginação.

##  Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Swagger / OpenAPI
- Git e GitHub

##  Funcionalidades

- ✅ Criar tarefas
- ✅ Listar tarefas
- ✅ Atualizar tarefas
- ✅ Excluir tarefas
- ✅ Validação dos dados
- ✅ Tratamento personalizado de erros
- ✅ DTOs para entrada e saída da API
- ✅ Filtro por status de conclusão
- ✅ Paginação
- ✅ Documentação da API com Swagger
- ✅ Persistência em PostgreSQL

##  Arquitetura

O projeto utiliza uma arquitetura em camadas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL

Além disso, utiliza DTOs para separar os dados recebidos e enviados pela API das entidades utilizadas no banco de dados.

            Estrutura do projeto

src/main/java/com/gustavo/taskflow
│
├── controller
│   └── TarefaController.java
│
├── dto
│   ├── TarefaRequest.java
│   └── TarefaResponse.java
│
├── entity
│   └── Tarefa.java
│
├── exception
│   ├── TarefaNaoEncontradaException.java
│   └── TratamentoDeErros.java
│
├── repository
│   └── TarefaRepository.java
│
└── service
    └── TarefaService.java

                 Endpoints

Criar tarefa
POST /tarefas

Exemplo:

{
  "titulo": "Estudar Spring Boot",
  "descricao": "Aprender desenvolvimento de APIs REST",
  "concluida": false
}
Listar tarefas
GET /tarefas
Filtrar por conclusão
GET /tarefas?concluida=true

ou:

GET /tarefas?concluida=false
Paginação
GET /tarefas?page=0&size=10

Também é possível combinar filtro e paginação:

GET /tarefas?concluida=false&page=0&size=10
Atualizar tarefa
PUT /tarefas/{id}
Excluir tarefa
DELETE /tarefas/{id}

              Swagger

Com a aplicação em execução, a documentação interativa da API pode ser acessada em:

http://localhost:8080/swagger-ui.html

                Configuração

O projeto utiliza PostgreSQL.

Configure a variável de ambiente:

DB_PASSWORD

com a senha do usuário do PostgreSQL.

A aplicação utiliza:

jdbc:postgresql://localhost:5432/taskflow
▶️ Como executar

Clone o projeto:

git clone <URL_DO_REPOSITORIO>

Entre na pasta:

cd taskflow

Execute:

./mvnw spring-boot:run

No Windows:

.\mvnw spring-boot:run

            Objetivo do projeto

Este projeto faz parte da minha evolução prática em Engenharia de Software, com foco em desenvolvimento backend utilizando Java e Spring Boot.

O objetivo é aplicar conceitos estudados na graduação em projetos práticos para construção de portfólio.

Desenvolvido por Gustavo Gonçalves do Prado.