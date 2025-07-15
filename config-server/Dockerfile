FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY build/libs/config-server.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
