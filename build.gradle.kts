plugins {
    id("org.springframework.boot") version "3.2.6" apply false
    id("io.spring.dependency-management") version "1.1.4" apply false
    id("java")
}

repositories {
    group = "com.wimp"
    version = "0.0.1-SNAPSHOT"
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}