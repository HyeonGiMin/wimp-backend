plugins {
    id("org.springframework.boot") version "3.2.5" // 버전에 맞게 변경
    id("io.spring.dependency-management") version "1.1.4"
    id("java")
}

group = "com.wimp"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web") // 기본 REST + Jackson 포함
    implementation("org.springframework.boot:spring-boot-starter-webflux") // WebClient 사용
    implementation("org.springframework.boot:spring-boot-starter-logging") // SLF4J + Logback 포함
    implementation("org.projectlombok:lombok:1.18.30")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.squareup.okhttp3:mockwebserver:4.11.0")
}
