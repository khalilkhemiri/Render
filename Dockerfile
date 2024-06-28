FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /home/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM openjdk:17-jdk-slim
WORKDIR /home/app
COPY --from=build /home/app/target/spring_rest_docker.jar ./spring_rest_docker.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","spring_rest_docker.jar"]
