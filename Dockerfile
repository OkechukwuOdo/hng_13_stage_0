# ---- Stage 1: Build the JAR ----
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy project files
COPY . .

# Build the project (skip tests for speed)
RUN mvn clean package -DskipTests

# ---- Stage 2: Run the JAR ----
FROM openjdk:17-jdk-alpine
WORKDIR /app

# Copy built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
