# READ API

## Description

The READ API serves as the backend service for the READ (Repositório Eletrônico de Arquivos e Documentos) system, an Electronic Document Management System (EDMS) developed for the Department of Applied Informatics (DIA) at the Federal University of the State of Rio de Janeiro (UNIRIO). It provides endpoints for managing documents, user permissions, and departments, handling the core business logic of the system.

## Context

This project was developed as part of a capstone project to address the document management needs identified within the DIA at UNIRIO. The goal was to create a tailored solution to improve document handling processes within the department. Details of the project's conception and development can be found in the [associated paper](https://bsi.uniriotec.br/wp-content/uploads/sites/31/2024/04/202401DaviAnjosdeFaria.pdf).

## Code

### Technologies

- **Language:** Kotlin
- **Framework:** Spring Boot
- **Build Tool:** Maven

### Folder Structure

- `src/main/kotlin/`: Contains the Kotlin source code.
  - `controller/`: REST controllers handling HTTP requests.
  - `service/`: Business logic and services.
  - `repository/`: Data access layers and repositories.
  - `model/`: Data models and entities.
- `src/main/resources/`: Contains application configuration files.
- `pom.xml`: Maven configuration file for project dependencies and build configuration.

## Setup 🛠️

### Environment Variables

- `DB_POSTGRESQL_URL`: Connection string for the PostgreSQL database.
- `DB_ELASTICSEARCH_URL`: URL for the Elasticsearch instance.
- `MAIL_USERNAME`: Username for the Gmail account that will send the platform e-mails.
- `MAIL_PASSWORD`: Passwqord for the Gmail account that will send the platform e-mails.
- `AUTH_CLIENTID`: Client ID for Google OAuth 2.0 (e.g., `123456789012-a12bcde3fg4h56jk7lmn8o9pqrs01tuv.apps.googleusercontent.com`).
- `JWT_SECRET_KEY`: Base64 encoded secret for signing generated JWTs.
- `ALLOWED_ORIGINS`: Allowed origins string. Usually this should be your frontend application URL (e.g., `https://localhost:3000`).
- [optional] `TESSERACT_LANG`: Language of the contents to be extracted from the documents. See [Tesseract docs](https://github.com/tesseract-ocr/tesseract/blob/main/doc/tesseract.1.asc#languages). Defaults to `por+eng`.
- [optional] `FILE_STORAGE_PATH`: Path for binary storage of document files. Defaults to the current folder the app is running.

### Other Services

- **PostgreSQL Database**: The API requires access to a PostgreSQL database for data storage.
- **Elasticsearch Instance**: The API requires access to an Elasticsearch instance for document content storage.
- **Tesseract**: In order for the document content extraction to work, the API requires an instance of [Tesseract](https://github.com/tesseract-ocr/tesseract) to be running on the server.
- **Frontend Application**: While the API can function independently, it is designed to serve the [READ Frontend Application](https://github.com/fariadavi/read) for a complete user experience.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
