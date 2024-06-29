# Use the official Maven image as the base image
FROM maven:3.8.6-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the Maven configuration and source code
COPY pom.xml .
COPY src ./src

# Run Maven to build the application
RUN mvn clean package

# Use a smaller base image for the final image
FROM openjdk:17-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/spring_rest_docker.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
