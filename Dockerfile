FROM openjdk:17-jdk-alpine
cd /app
./mvnw clean package -DskipTests
COPY /app/target/inventorycontrol-0.0.1-SNAPSHOT /app
EXPOSE 8080
CMD ["java", "-jar", "inventorycontrol-0.0.1-SNAPSHOT.jar"]