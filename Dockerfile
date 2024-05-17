FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jre-slim
COPY --from=build /app/target/inventorycontrol-0.0.1-SNAPSHOT.jar /inventorycontrol-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/myapp.jar"]
