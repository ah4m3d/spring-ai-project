# Spring AI Project

## Overview
This project is a Spring Boot application designed to interact with AI functionalities. It provides a service for generating AI responses based on predefined prompts.

## Project Structure
```
spring-ai-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── springaiproject
│   │   │               ├── SpringAiProjectApplication.java
│   │   │               └── service
│   │   │                   └── AiService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── prompts
│   │           └── prompt.txt
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── springaiproject
│                       └── SpringAiProjectApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd spring-ai-project
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using:
   ```
   mvn spring-boot:run
   ```

## Usage
- The main entry point of the application is located in `SpringAiProjectApplication.java`.
- The `AiService` class contains methods for generating AI responses. You can customize the prompts in `src/main/resources/prompts/prompt.txt`.

## Testing
Unit tests for the application can be found in `SpringAiProjectApplicationTests.java`. You can run the tests using:
```
mvn test
```

## Dependencies
The project uses Maven for dependency management. Check `pom.xml` for the list of dependencies and plugins used in the project.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.