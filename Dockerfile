FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN ls -l
RUN mvn clean package -DskipTests

FROM amazoncorretto:17-alpine3.19
COPY --from=build /app/target/inventorycontrol-0.0.1-SNAPSHOT.jar /inventorycontrol-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/inventorycontrol-0.0.1-SNAPSHOT.jar"]
