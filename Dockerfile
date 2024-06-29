FROM openjdk:17-alpine

WORKDIR /app

COPY target/spring_rest_docker.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
