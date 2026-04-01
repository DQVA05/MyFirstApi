# MyFirstApi

A simple REST API built with **Java**, **Spring Boot**, and **Maven**, developed and deployed using **Visual Studio Code**.

---

## Table of Contents

- [About the Project](#about-the-project)
- [Prerequisites](#prerequisites)
- [Setting Up Visual Studio Code](#setting-up-visual-studio-code)
- [Creating the Project](#creating-the-project)
- [Project Structure](#project-structure)
- [Running the API](#running-the-api)
- [Testing the API](#testing-the-api)
- [Building for Production](#building-for-production)
- [Technologies Used](#technologies-used)

---

## About the Project

This project demonstrates how to create and deploy a simple REST API using:

- **Java** — the programming language
- **Spring Boot** — framework that simplifies building production-ready Java applications
- **Maven** — build automation and dependency management tool
- **Visual Studio Code** — lightweight but powerful source code editor

---

## Prerequisites

Before you begin, make sure you have the following installed on your machine:

| Tool | Version | Download |
|------|---------|----------|
| Java Development Kit (JDK) | 17 or higher | [Adoptium](https://adoptium.net/) |
| Apache Maven | 3.8 or higher | [maven.apache.org](https://maven.apache.org/download.cgi) |
| Visual Studio Code | Latest | [code.visualstudio.com](https://code.visualstudio.com/) |

### Verify installations

Open a terminal and run:

```bash
java -version
mvn -version
```

---

## Setting Up Visual Studio Code

Install the following VS Code extensions to get full Java and Spring Boot support:

1. Open VS Code and go to the **Extensions** panel (`Ctrl+Shift+X` / `Cmd+Shift+X`)
2. Search for and install the following:

| Extension | Publisher |
|-----------|-----------|
| Extension Pack for Java | Microsoft |
| Spring Boot Extension Pack | VMware |
| Spring Initializr Java Support | Microsoft |

---

## Creating the Project

### Option 1 — Using Spring Initializr inside VS Code

1. Open the Command Palette (`Ctrl+Shift+P` / `Cmd+Shift+P`)
2. Type **Spring Initializr: Create a Maven Project**
3. Choose the following settings:
   - **Spring Boot version**: 3.x (latest stable)
   - **Project language**: Java
   - **Group Id**: `com.example`
   - **Artifact Id**: `myfirstapi`
   - **Packaging**: Jar
   - **Java version**: 17
   - **Dependencies**: Spring Web
4. Select a folder to save the project and open it in VS Code

### Option 2 — Using Spring Initializr website

1. Go to [https://start.spring.io](https://start.spring.io)
2. Fill in the project details:
   - **Project**: Maven
   - **Language**: Java
   - **Spring Boot**: 3.x
   - **Group**: `com.example`
   - **Artifact**: `myfirstapi`
   - **Packaging**: Jar
   - **Java**: 17
   - **Dependencies**: Spring Web
3. Click **Generate**, unzip the downloaded file, and open the folder in VS Code

---

## Project Structure

```
myfirstapi/
├── src/
│   ├── main/
│   │   ├── java/com/example/myfirstapi/
│   │   │   ├── MyFirstApiApplication.java   # Application entry point
│   │   │   └── HelloController.java         # REST controller
│   │   └── resources/
│   │       └── application.properties       # Application configuration
│   └── test/
│       └── java/com/example/myfirstapi/
│           └── MyFirstApiApplicationTests.java
├── pom.xml                                  # Maven build file
└── README.md
```

### Example Controller

Create `src/main/java/com/example/myfirstapi/HelloController.java`:

```java
package com.example.myfirstapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World! My First API is running!";
    }
}
```

---

## Running the API

### From VS Code

1. Open the project folder in VS Code
2. Open the file `MyFirstApiApplication.java`
3. Click the **Run** button that appears above the `main` method, or press `F5`

### From the Terminal

Open the integrated terminal in VS Code (`Ctrl+` `` ` ``) and run:

```bash
mvn spring-boot:run
```

The application will start on **http://localhost:8080** by default.

---

## Testing the API

Once the application is running, you can test the endpoint using:

### Browser

Open your browser and navigate to:

```
http://localhost:8080/api/hello
```

### curl

```bash
curl http://localhost:8080/api/hello
```

### VS Code REST Client extension

Install the **REST Client** extension in VS Code, create a file `requests.http`, and add:

```http
GET http://localhost:8080/api/hello
```

Then click **Send Request** above the line.

**Expected response:**

```
Hello, World! My First API is running!
```

---

## Building for Production

To package the application as a runnable JAR file:

```bash
mvn clean package
```

This generates a JAR file in the `target/` folder. Run it with:

```bash
java -jar target/myfirstapi-0.0.1-SNAPSHOT.jar
```

---

## Technologies Used

- [Java 17](https://adoptium.net/)
- [Spring Boot 3.x](https://spring.io/projects/spring-boot)
- [Apache Maven](https://maven.apache.org/)
- [Visual Studio Code](https://code.visualstudio.com/)
