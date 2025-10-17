#FROM openjdk:17-jdk-alpine
#WORKDIR /app
#COPY target/ app.jar
#EXPOSE 8080
#CMD ["java", "-jar", "app.jar"]

# Use OpenJDK 17 with Alpine for a lightweight image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose port 8080 for your Spring Boot app
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
