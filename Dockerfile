FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app2
COPY /app .
RUN ls -l
RUN mvn clean package -DskipTests

FROM amazoncorretto:17-alpine3.19
RUN ls -l
EXPOSE 8080
CMD ["java", "-jar", "/app2/target/inventorycontrol-0.0.1-SNAPSHOT.jar"]
