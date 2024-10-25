plugins {
	java
	id("org.springframework.boot") version "3.3.5"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "dat250"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
//	implementation("org.springframework.boot:spring-boot-starter-amqp")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
//	implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
	implementation("jakarta.transaction:jakarta.transaction-api")
//	implementation("org.springframework.amqp:spring-rabbit-stream")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
//	developmentOnly("org.springframework.boot:spring-boot-docker-compose")
	runtimeOnly("com.h2database:h2")
//	runtimeOnly("org.postgresql:postgresql")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
//	testImplementation("org.springframework.boot:spring-boot-testcontainers")
//	testImplementation("io.projectreactor:reactor-test")
//	testImplementation("org.springframework.amqp:spring-rabbit-test")
//	testImplementation("org.testcontainers:junit-jupiter")
//	testImplementation("org.testcontainers:mongodb")
//	testImplementation("org.testcontainers:postgresql")
//	testImplementation("org.testcontainers:rabbitmq")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
