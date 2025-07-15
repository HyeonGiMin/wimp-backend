plugins {
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
    java
}

group = "com.wimp"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

tasks.named<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    // applicationVersion 파라미터가 있으면 그 값을, 없으면 기본 project.version 사용
    val jarVersion = if (project.hasProperty("applicationVersion")) {
        project.property("applicationVersion") as String
    } else {
        project.version.toString()
    }
    archiveVersion.set(jarVersion)
}



dependencies {
    implementation("org.springframework.cloud:spring-cloud-config-server")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("de.codecentric:spring-boot-admin-starter-client")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2023.0.1")
        mavenBom("de.codecentric:spring-boot-admin-dependencies:3.1.8")
    }
}

tasks.bootJar {
    archiveFileName.set("config-server.jar") // 또는 config-server.jar 등 원하는 이름
}