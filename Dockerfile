FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy the Maven Wrapper files and pom.xml to cache dependencies
COPY ./mvnw .
COPY ./mvnw.cmd .
COPY ./pom.xml .

# Copy the project source
COPY ./src ./src

# Package the application
RUN ./mvnw clean package -DskipTests

# Copy the packaged jar file to the container
COPY ./target/inventorycontrol-0.0.1-SNAPSHOT.jar .

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "inventorycontrol-0.0.1-SNAPSHOT.jar"]
