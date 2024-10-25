# DAT250 fullstack demo project
For my final project in Advanced Software Technologies, I am to create a fullstack project for an application that
has user-created polls that other registered users can vote on. 

## Step 1: Software Set-Up
I made sure that I had `sdkman`, `java`, and `gradle` installed (update them to their latest versions if needed). 
```
$ sdk version

SDKMAN!
script: 5.18.2
native: 0.4.6
```
```
$ java -version
openjdk version "21.0.5" 2024-10-15 LTS
OpenJDK Runtime Environment Temurin-21.0.5+11 (build 21.0.5+11-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.5+11 (build 21.0.5+11-LTS, mixed mode, sharing)
```
``` 
$ javac -version
javac 21.0.5
```
``` 
$ sdk use java 21.0.5-tem

Using java version 21.0.5-tem in this shell.
```
``` 
$ gradle -v

------------------------------------------------------------
Gradle 8.10
------------------------------------------------------------

Build time:    2024-08-14 11:07:45 UTC
Revision:      fef2edbed8af1022cefaf44d4c0514c5f89d7b78

Kotlin:        1.9.24
Groovy:        3.0.22
Ant:           Apache Ant(TM) version 1.10.14 compiled on August 16 2023
Launcher JVM:  21.0.5 (Eclipse Adoptium 21.0.5+11-LTS)
Daemon JVM:    C:\Users\amali\.sdkman\candidates\java\21.0.5-tem (no JDK specified, using current Java home)
OS:            Windows 11 10.0 amd64
```
``` 
$ git -v
git version 2.46.0.windows.1
```

## Step 2: Initialize Spring Boot Project
I went to the [Spring Boot Initializer](https://start.spring.io/) to create a new project with the following metadata 
and dependencies: 

- Project: Gradle-Kotlin 
- Language: Java 
- Spring Boot: 3.3.5 


- Project Metadata:
  - Group: dat250 
  - Artifact/Name: fullstack-demo 
  - Packaging: Jar 
  - Java: 21 

- Dependencies:
  - Spring Web 
  - Lombok 
  - Spring Boot DevTools 
  - Spring for RabbitMQ 
  - Spring Data JPA 
  - Spring Data MongoDB 
  - Spring Data Reactive MongoDB 
  - Docker Compose Support 
  - Testcontainers 
  - H2 Database 
  - PostgreSQL Driver 
  - Spring Data MongoDB 
  - Spring Data Reactive MongoDB

Once I unzipped the project and opened it in `IntelliJ`, I commented out the following files and code because I do not 
need them at this point: 

From `build.gradle.kts` I commented out
- Spring for RabbitMQ
- Spring Data JPA
- Spring Data MongoDB
- Spring Data Reactive MongoDB
- Docker Compose Support
- Testcontainers
- H2 Database
- PostgreSQL Driver
- Spring Data MongoDB
- Spring Data Reactive MongoDB

From the `FullstackDemoApplicationTests.java`-file I commented out the line
`@Import(TestcontainersConfiguration.class)`

And I commented out everything from 
- `compose.yaml`
- `TestFullstackDemoApplication.java`
- `TestcontainersConfiguration.java`

After this, I ran the project with the following commands to test, run, and create a `.jar`-file for the application:
``` 
./gradlew test 
./gradlew bootRun # Check that its running in http://localhost:8080
./gradlew bootJar
```

## Step 3: Create GitHub Action (workflow)
