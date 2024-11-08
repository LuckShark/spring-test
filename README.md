# Sistema de Gerenciamento de Usuários e Departamentos

Este é um projeto simples desenvolvido em **Java Spring Boot** com um banco de dados **H2** embutido. O objetivo deste projeto é servir como uma API REST que permite gerenciar usuários e departamentos, abordando conceitos fundamentais de programação, anotações e práticas de mercado.

## Objetivos do Projeto

- Reforçar fundamentos de programação
- Praticar conceitos de REST APIs usando Spring Boot
- Desenvolver habilidades no uso de anotações Spring e integração com banco de dados
- Criar uma aplicação prática para fortalecer o conhecimento em desenvolvimento back-end

## Visão Geral

O sistema consiste em uma API REST para gerenciar usuários e departamentos. A aplicação permite realizar operações básicas de CRUD em ambas as entidades. Os principais casos de uso são:

- Buscar todos os usuários
- Buscar um usuário pelo ID
- Inserir um novo usuário

Esses endpoints são acompanhados de respostas em JSON, o que facilita a integração com aplicações front-end.

## Estrutura do Projeto

- **Java Spring Boot**: Framework para construir APIs REST com suporte a injeção de dependências, controle de transações e mais.
- **Banco de Dados H2**: Banco de dados em memória utilizado para armazenamento temporário dos dados, facilitando o desenvolvimento e testes.
- **Spring Data JPA**: Usado para mapeamento e persistência dos dados entre o banco e a aplicação.

## Endpoints Disponíveis

### Usuários

- **GET /users**: Retorna todos os usuários cadastrados.
- **GET /users/{id}**: Retorna um único usuário com base no seu ID.
- **POST /users**: Insere um novo usuário no sistema.

### Departamentos

- **GET /departments**: Retorna todos os departamentos cadastrados.
- **GET /departments/{id}**: Retorna um departamento com base no seu ID.
- **POST /departments**: Insere um novo departamento no sistema.

## Como Executar o Projeto

1. **Pré-requisitos**:
   - Java 23
   - Maven

2. **Clonar o Repositório**:
   ```bash
   git clone <url_do_repositorio>
   cd <nome_do_projeto>
   ```

3. **Compilar e Executar**:
   ```bash
   mvn spring-boot:run
   ```

4. **Acessar a Aplicação**:
   A API estará disponível em `http://localhost:8080`.

5. **Acessar Console H2**:
   O console do banco de dados H2 pode ser acessado em `http://localhost:8080/h2-console`. 
   - **JDBC URL**: `jdbc:h2:mem:testdb`
   - **Username**: `sa`
   - **Password**: (em branco)

## Estrutura do Código

- **/src/main/java**: Contém as classes principais do projeto, incluindo controladores (controllers), serviços e repositórios.
- **/src/main/resources**: Contém configurações e o script de inicialização do banco H2.

## Tecnologias Utilizadas

- **Java 23**
- **Spring Boot**
- **Spring Data JPA**
- **Banco de Dados H2**
- **Maven**
